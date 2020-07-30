package com.blueSprint.pages;

import com.blueSprint.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class announcementPage extends BasePage {
    Actions actions = new Actions( Driver.getDriver() );
    @FindBy(css = "#feed-add-post-form-link-text")
    public WebElement moreTab;
    @FindBy(xpath = "//div[@class='menu-popup-items']//span[3]")
    public WebElement announcementTab;
    @FindBy(xpath = "//body[@style='min-height: 115px;']")
    public WebElement textBox;
    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;
    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileBtn;
    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm']//i")
    public WebElement linkBtn;
    @FindBy(xpath = "//span[@id='bx-b-video-blogPostForm']//i")
    public WebElement videoUpldBtn;
    @FindBy(xpath = "//span[@id='bx-b-quote-blogPostForm']//i")
    public WebElement quoteBtn;
    @FindBy(css = "#bx-b-mention-blogPostForm")
    public WebElement mentionBtn;
    @FindBy(css = "#bx-b-tag-input-blogPostForm")
    public WebElement tagBtn;
    @FindBy(xpath = "//span[@id='bx-b-tag-input-blogPostForm']//following-sibling::span")
    public WebElement recordVideoBtn;
    @FindBy(css = "#bx-destination-tag")
    public WebElement addmoreBtn;
    @FindBy(css = "a[id*=destDepartmentTab]")
    public WebElement empDepBtn;
    @FindBy(css = "#destLastTab_destination8521561")
    public WebElement recenttab;
    @FindBy(css = "#bx-b-tag-input-blogPostForm")
    public WebElement addTagBtn;
    @FindBy(xpath = "//body[@style='min-height: 527px;']//blockquote")
    public WebElement blockQuote;
    @FindBy(xpath = "//a[@id='mention15212472_last_U768']")
    public WebElement helpdesk2;
    @FindBy(css = "#TAGS_blogPostForm67abSn")
    public WebElement addtaginput;
    @FindBy(css = "#lhe_button_editor_blogPostForm")
    public WebElement visualeditor;
    @FindBy(css = "#lhe_button_title_blogPostForm")
    public  WebElement topicBtn;
    public void moreTabClick(){
        moreTab.click();
    }


        public void SendButtonClick(){
        sendButton.click();
        }
        public void hoverEmpDep(){
        actions.moveToElement( empDepBtn ).click().perform();


        }
        public void clickComma(){
         quoteBtn.click();
        }
        public void blockquoteTxt(String text){
        actions.moveToElement( blockQuote ).sendKeys( text );
        }
        public void clickAddmention(){
        actions.doubleClick(mentionBtn);
        }

        public void clickaddtag(){
        tagBtn.click();
        }
        public void addtaginput(){
        addtaginput.sendKeys( "bahtiyarMuhsin" +Keys.ENTER);
        }

    }

