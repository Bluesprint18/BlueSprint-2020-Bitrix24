package com.blueSprint.stepDefinitions;

import com.blueSprint.pages.LoginPage;
import com.blueSprint.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class LoginStepDfs {
    LoginPage loginPage = new LoginPage();
    @When("User login as valid username and password")
    public void userLoginAsValidUsernameAndPassword(DataTable credentials) {
        List<List<String>>data=credentials.asLists();
        loginPage.userInput.sendKeys( data.get( 0 ).get( 0 ) );
        loginPage.passwordInput.sendKeys( data.get( 0 ).get( 1 ) );
        loginPage.loginButton.click();
    }

    @Then("User should able to see dashboard")
    public void user_should_able_to_see_dashboard() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "(26) Portal";
        Assert.assertEquals( actualTitle,expectedTitle );
    }


}
