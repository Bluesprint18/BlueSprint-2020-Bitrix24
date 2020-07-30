package com.blueSprint.pages;

import com.blueSprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class ActiveStreamPage{
        public ActiveStreamPage(){
            PageFactory.initElements( Driver.getDriver(),this );
        }
        @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']")
        public WebElement taskTab;

        @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
        public   WebElement HighPriorityCheckBox;

        @FindBy(xpath = "//span[@id='lhe_button_editor_task-form-lifefeed_task_form']")
        public WebElement VisualEditor;

        @FindBy(xpath = "//div[@id='bx-html-editor-tlbr-lifefeed_task_form']")
        public WebElement VisualEditorBar;


        @FindBy(xpath = "")
        public WebElement UploadFileIcon;




    }



