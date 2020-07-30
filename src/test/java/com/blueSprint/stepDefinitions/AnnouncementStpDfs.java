package com.blueSprint.stepDefinitions;

import com.blueSprint.pages.LoginPage;
import com.blueSprint.pages.announcementPage;
import com.blueSprint.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AnnouncementStpDfs extends LoginPage {
    WebDriverWait wait = new WebDriverWait( Driver.getDriver(), 30 );
    announcementPage ancPage = new announcementPage();
    Actions actions = new Actions( Driver.getDriver() );
    Faker faker = new Faker();

    //THIS IS BACKGROUND FOR ALL SCENARIO IN FEATURE FILE
    @When("I submit {string} and {string}")
    public void i_submit_and(String userName, String passWord) {
        userInput.sendKeys( userName );
        passwordInput.sendKeys( passWord );
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        loginButton.click();
    }

    // THIS IS MY #1 SCENARIO
    @Given("As user i should able click More tab under Activity Stream")
    public void as_user_i_should_able_click_more_tab_under_activity_stream() {
        Driver.getDriver().manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
        ancPage.moreTabClick();
    }

    @When("As user i should able to click announcement subheading")
    public void as_user_i_should_able_to_click_announcement_subheading() {
        String word = faker.gameOfThrones().quote();
        actions.moveToElement( ancPage.announcementTab ).click().sendKeys( word ).perform();
    }

    @Then("As user i should able to click send button")
    public void as_user_i_should_able_to_click_send_button() {
        ancPage.SendButtonClick();
    }

    //THIS IS MY #2 SCENARIO

    @Given("As user i should able click More tab")
    public void as_user_i_should_able_click_more_tab() {
        ancPage.moreTabClick();
    }

    @When("As user i should able to click announcement")
    public void as_user_i_should_able_to_click_announcement() {
        actions.moveToElement( ancPage.announcementTab ).click().perform();
    }

    @When("As user should be able to click on add more")
    public void as_user_should_be_able_to_click_on_add_more() {
        ancPage.addmoreBtn.click();
    }

    @Then("As user should be able to click on Employees and Departments")
    public void as_user_should_be_able_to_click_on_employees_and_departments() {
        actions.moveToElement( ancPage.empDepBtn ).click().perform();
    }

    @Then("As user should be able to add more receiver")
    public void as_user_should_be_able_to_add_more_receiver() {
        WebElement receiver = Driver.getDriver().findElement( By.xpath(
                "//div[@id='bx-lm-category-relation-129']//a[@rel='U519']" ) );
        actions.moveToElement( receiver ).click().perform();
    }

    @Then("As user i should able to click and close tab")
    public void as_user_i_should_able_to_click_and_close_tab() {
        WebElement closeBtn = Driver.getDriver().findElement( By.xpath(
                "//span[@class='popup-window-close-icon']" ) );
        actions.moveToElement( closeBtn ).click().perform();
    }

    //THIS IS MY # 3 SCENARIO
    @When("AS user i should able to click on comma")
    public void as_user_i_should_able_to_click_on_comma() {
        String GOTname = faker.gameOfThrones().character();
        actions.moveToElement( ancPage.quoteBtn ).click().sendKeys( GOTname ).perform();
    }

    @Then("As user i should able to click on add mention")
    public void asUserIShouldAbleToClickOnAddMention() {
        actions.moveToElement( ancPage.mentionBtn ).click().perform();
        actions.moveToElement( ancPage.empDepBtn ).click().perform();
        WebElement receiver = Driver.getDriver().findElement( By.xpath(
                "//div[@id='bx-lm-category-relation-129']//a[@rel='U519']" ) );
        actions.moveToElement( receiver ).click().perform();
        ancPage.sendButton.click();
    }

    //THIS IS MY # 4 SCENARIO
    @Then("As user i should able to click on add tags")
    public void as_user_i_should_able_to_click_on_add_tags() {
        String name = faker.gameOfThrones().character();
        actions.moveToElement( ancPage.addTagBtn ).click().sendKeys( name + Keys.ENTER ).perform();
    }

    // THIS IS MY # 5 SCENARIO
    @Then("As User should be able to click on upload files icon")
    public void as_user_should_be_able_to_click_on_upload_files_icon() {
        ancPage.uploadFileBtn.click();
        WebElement uploadBtn = Driver.getDriver().findElement( By.xpath( "//input[@name='bxu_files[]']" ) );
        String filePath = "C:\\Users\\bahti\\OneDrive\\Desktop\\hulk.jpg";
        uploadBtn.sendKeys( filePath );

    }

    @Then("As User upload files and pictures from local disks")
    public void as_user_upload_files_and_pictures_from_local_disks() {
        Driver.getDriver().findElement( By.xpath( "//span[@class='insert-btn-text']" ) ).click();
    }

    @Then("as user i should able to see the upload file is successful")
    public void as_user_i_should_able_to_see_the_upload_file_is_successful() {
        WebElement iFrame = Driver.getDriver().findElement( By.xpath( "//iframe[@class='bx-editor-iframe']" ) );
        Driver.getDriver().switchTo().frame( iFrame );
        WebElement image = Driver.getDriver().findElement( By.cssSelector( "img[id*='bxid']" ) );
        wait.until( ExpectedConditions.visibilityOf( image ) );
        Assert.assertTrue( image.isDisplayed() );
    }
    // THIS IS MY # 6 SCENARIO

    @Then("As user i should able to click on link icon")
    public void as_user_i_should_able_to_click_on_link_icon() {
        WebElement linkTab = Driver.getDriver().findElement( By.cssSelector( "" +
                ".bxhtmled-top-bar-btn.bxhtmled-button-link" ) );
        linkTab.click();

        //Driver.getDriver().findElement( By.cssSelector( "#undefined" ) ).click();
    }

    @Then("As user i should see link attaching window and enter text and link")
    public void as_user_i_should_see_link_attaching_window_and_enter_text_and_link() {
        WebElement textInput = Driver.getDriver().findElement( By.cssSelector(
                "#linkidPostFormLHE_blogPostForm-text" ) );
        WebElement urlInput = Driver.getDriver().findElement( By.cssSelector(
                "#linkidPostFormLHE_blogPostForm-href" ) );
        //#linkidPostFormLHE_blogPostForm-href
        textInput.sendKeys( faker.gameOfThrones().character() );
        urlInput.sendKeys(
                "https://github.com/Bluesprint18/BlueSprint-2020-Bitrix24/", Keys.ENTER );

    }

    //THIS IS MY #7 SCENARIO

    @Then("As user i should able to click insert video icon")
    public void as_user_i_should_able_to_click_insert_video_icon() {
        ancPage.videoUpldBtn.click();
    }

    @Then("As user i should able to enter video source")
    public void as_user_i_should_able_to_enter_video_source() {
        WebElement videoUrl = Driver.getDriver().findElement( By.cssSelector(
                "#video_idPostFormLHE_blogPostForm-source" ) );
        videoUrl.sendKeys( "https://www.youtube.com/watch?v=fGAggGbvtw4&t=359s" + Keys.ENTER );
    }

    //THIS IS MY # 8 SCENARIO

    @Then("As user i should able to click on Visual editor and topic")
    public void as_user_i_should_able_to_click_on_visual_editor_and_topic() {
        ancPage.visualeditor.click();
        ancPage.topicBtn.click();
    }

    @Then("As user i should able to see Visual editor and topic on top")
    public void as_user_i_should_able_to_see_visual_editor_and_topic_on_top() {
        WebElement toolBar = Driver.getDriver().findElement( By.cssSelector(
                "#bx-html-editor-tlbr-idPostFormLHE_blogPostForm" ) );
        WebElement topicBar = Driver.getDriver().findElement( By.cssSelector( "#POST_TITLE" ) );
        Assert.assertTrue( toolBar.isDisplayed() );
        Assert.assertTrue( topicBar.isDisplayed() );
    }

    //THIS IS MY # 9 SCENARIO

    @Then("As user i should able to click on record video")
    public void as_user_i_should_able_to_click_on_record_video() {
        ancPage.recordVideoBtn.click();
    }

    @Then("As user i should able to click allow button to record")
    public void as_user_i_should_able_to_click_allow_button_to_record() throws InterruptedException {
        WebElement allowBtn = Driver.getDriver().findElement( By.cssSelector(
                ".popup-window-button.popup-window-button-blue" ) );
        allowBtn.click();
        //.bx-videomessage-video-close
        Driver.getDriver().findElement( By.cssSelector( ".bx-videomessage-video-close" ) ).click();

    }
}


