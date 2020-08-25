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

//    @FindBy(xpath = "(( //tbody)[7]//following::span[.='Drag files here to upload'])[1]")
  @FindBy(xpath = "((//tbody)[7]//following::span[.='Upload files and images'])[1]")
    public WebElement uploadFilesImages ;

    @FindBy(id = "blog-submit-button-save")
    public WebElement buttonSend;

    // hi  hzxjdnakdgvnsdg

}
