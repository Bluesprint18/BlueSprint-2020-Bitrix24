Feature: Upload , Download
  As a user, I should be able to send files
  by selecting File subheading from "More" tab under Activity Stream.

Background:
Given I am on the login page user

  @winUpload
Scenario: upload file
When  I login with valid credentials
Then  I push to "Activity Stream" button
And   I click to "More" button
And  I click to "File" button
Then  I upload file then click to send


@winDownload
Scenario: download from external drive
When  I login with valid credentials
Then  I push to "Activity Stream" button
And   I click to "More" button
And   I click to "File" button
And   I click to "Download from external drive"
Then   I should download from external drive

@winSelect
Scenario:User should select documents from bixtrix24
When  I login with valid credentials
Then  I push to "Activity Stream" button
And   I click to "More" button
And   I click to "File" button
And   I click to "Select document from Bitrix24"
Then  I should select documents from bixtrix24

@winSelect
  Scenario: User should create files to upload
When  I login with valid credentials
Then  I push to "Activity Stream" button
And   I click to "More" button
When  I click to "File" button
Then  I click to "Create using Desktop applications"
And   I should create files to upload