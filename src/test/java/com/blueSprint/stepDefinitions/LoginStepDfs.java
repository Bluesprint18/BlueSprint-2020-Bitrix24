package com.blueSprint.stepDefinitions;

import com.blueSprint.pages.LoginPage;
import com.blueSprint.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDfs {
    LoginPage loginPage = new LoginPage();

    @When("User login as valid {string} and {string}")
    public void userLoginAsValidAnd(String userName, String password) {
        loginPage.userInput.sendKeys( userName );
        loginPage.passwordInput.sendKeys( password );
        loginPage.loginButton.click();
    }

    @Then("User should able to see dashboard")
    public void user_should_able_to_see_dashboard() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "(26) Portal";
        Assert.assertEquals( actualTitle,expectedTitle );
    }

}
