package com.blueSprint.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(linkText = "Activity Stream")
    public WebElement ButtonActivityStream;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement ButtonMore;

    @FindBy(xpath = "(//span[.='File'])[2]")
    public WebElement buttonFile;

    @FindBy(linkText = "Upload files and images")
    public WebElement uploadFilesImages ;

}
