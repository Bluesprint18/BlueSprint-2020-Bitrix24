package com.blueSprint.pages;

import com.blueSprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements( Driver.getDriver(),this );
    }
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userInput;
    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;
    @FindBy(css = ".login-btn")
    public WebElement loginButton;
    @FindBy(css = ".errortext")
    public WebElement errorText;

}
