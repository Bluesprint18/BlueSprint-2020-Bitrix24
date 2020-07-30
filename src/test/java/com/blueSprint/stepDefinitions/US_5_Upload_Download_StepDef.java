package com.blueSprint.stepDefinitions;

import com.blueSprint.pages.HomePage;
import com.blueSprint.pages.LoginPage;
import com.blueSprint.utilities.ConfigurationReader;
import com.blueSprint.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class US_5_Upload_Download_StepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    Actions action = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//driver.findElement(By.xpath(locator)).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END), "text to enter");

    @Given("I am on the login page user")
    public void i_am_on_the_login_page_user() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {
    wait.until(ExpectedConditions.visibilityOf(loginPage.userInput));
        loginPage.userInput.sendKeys(ConfigurationReader.getProperty("username_us_5"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

        String expectedTitle = "(36) Portal";
        wait.until(ExpectedConditions.titleContains(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification FAILED!!!", actualTitle,expectedTitle);



    }

    @Then("I push to {string} button")
    public void i_push_to_button(String string) {
        wait.until(ExpectedConditions.visibilityOf(homePage.ButtonActivityStream));
      homePage.ButtonActivityStream.click();

    }

    @Then("I click to {string} button")
    public void i_click_to_button(String string) {
    wait.until(ExpectedConditions.visibilityOf(homePage.ButtonMore));
       // System.out.println(  "Home page is displayed "+homePage.ButtonMore.isDisplayed()  );
    action.moveToElement(homePage.ButtonMore).click().perform();
    action.moveToElement(homePage.buttonFile).click().perform();

    }

    @Then("I upload file then click to send")
    public void i_upload_file_then_click_to_send() {
    wait.until(ExpectedConditions.visibilityOf(homePage.uploadFilesImages));
        System.out.println(homePage.uploadFilesImages.isDisplayed());

    }




}
