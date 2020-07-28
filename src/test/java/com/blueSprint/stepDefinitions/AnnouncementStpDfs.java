package com.blueSprint.stepDefinitions;

import com.blueSprint.pages.LoginPage;
import com.blueSprint.pages.announcementPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnnouncementStpDfs extends LoginPage {
    @When("I submit username and password")
    public void iSubmitUsernameAndPassword() {
     userInput.sendKeys( "helpdesk65@cybertekschool.com" );
     passwordInput.sendKeys( "UserUser" );
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
      loginButton.click();
    }
    announcementPage announcementPage = new announcementPage();
    @When("As user i should able click More tab under Activity Stream")
    public void as_user_i_should_able_click_more_tab_under_activity_stream() {
     announcementPage.moreTabClick();
    }

    @Then("As user i should able to click announcement subheading and enter {string}")
    public void asUserIShouldAbleToClickAnnouncementSubheadingAndEnter(String text) {
        announcementPage.setAnnouncement(text);
    }

    @Then("As user i should able to click send button")
    public void as_user_i_should_able_to_click_send_button() {
       announcementPage.SendButtonClick();
    }



}
