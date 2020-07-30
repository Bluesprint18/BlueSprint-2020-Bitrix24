package com.blueSprint.stepDefinitions;

import com.blueSprint.pages.ActiveStreamPage;
import com.blueSprint.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ActiveStreamPageStepDefinitions {


    ActiveStreamPage activeStreamPage = new ActiveStreamPage();

    @Then("User click on task tab")
    public void user_click_on_task_tab() {

       // ActiveStreamPage.taskTab.click();

activeStreamPage.taskTab.click();

    }




    @Then("User click on High Priority Checkbox")
    public void user_click_on_high_priority_checkbox() throws InterruptedException {

        activeStreamPage.HighPriorityCheckBox.click();
        Thread.sleep(10);
    }

    @Then("User click on Visual Editor")
    public void user_click_on_visual_editor() throws InterruptedException {
       activeStreamPage.VisualEditor.click();


    }




    @Then("User should able to see editor text-bar displays on top of the message box")
    public void user_should_able_to_see_editor_text_bar_displays_on_top_of_the_message_box() {
activeStreamPage.VisualEditorBar.isDisplayed();


    }

    @Then("User click on Upload File Icon")
    public void user_click_on_upload_file_icon() throws InterruptedException {
        activeStreamPage.UploadFileIcon.click();
    }

        @Then("User should be able to upload files and pictures from local disks,")
        public void user_should_be_able_to_upload_files_and_pictures_from_local_disks() {

        }
        @Then("download from external drive, select document from Bitrix24, and create files to upload")
        public void download_from_external_drive_select_document_from_bitrix24_and_create_files_to_upload() {

        }

    }




























