package com.blueSprint.pages;

import com.blueSprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class announcementPage extends BasePage {
    @FindBy(css = "#feed-add-post-form-link-text")
    public WebElement moreTab;
    @FindBy(xpath = "//div[@class='menu-popup-items']//span[3]")
    public WebElement announcementTab;
    @FindBy(xpath = "//body[@style='min-height: 115px;']")
    public WebElement textBox;
    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;
    public void moreTabClick(){
        moreTab.click();
    }
    public void setAnnouncement(String text){
        Actions actions = new Actions( Driver.getDriver() );
        actions.moveToElement( announcementTab ).click().sendKeys(text).perform();
        }

        public void SendButtonClick(){
        sendButton.click();
        }
    }

