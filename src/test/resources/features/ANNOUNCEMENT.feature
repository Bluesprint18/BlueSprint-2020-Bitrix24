Feature: Send announcement
  Agile Story:As a user, I should be able to send announcement from
  Announcement subheading from "More" under Activity Stream.
# i use this login step for all my scenario
  Background: User is Logged In
    When I submit "helpdesk65@cybertekschool.com" and "UserUser"
    Then I should be logged in

# SENDING NEW ANNOUNCEMENT
  @sc01 @smoke
  Scenario: Send announcement Scenario
    Given As user i should able click More tab under Activity Stream
    When As user i should able to click announcement subheading
    Then As user i should able to click send button
# ADD MORE RECEIVER
  @sc02 @smoke
  Scenario: Add more receiver
    Given As user i should able click More tab
    When As user i should able to click announcement
    When As user should be able to click on add more
    Then As user should be able to click on Employees and Departments
    Then As user should be able to add more receiver
    Then As user i should able to click and close tab
# CLICK ON COMMA SIGN AND ADD MENTION
  @sc03 @smoke
  Scenario: Add quote and mention
    Given As user i should able click More tab
    When As user i should able to click announcement
    When AS user i should able to click on comma
    Then As user i should able to click on add mention
# ADD TAGS
  @sc04 @smoke
  Scenario: Add tags
    Given As user i should able click More tab
    When As user i should able to click announcement
    Then As user i should able to click on add tags
# UPLOAD FILE OR PICTURE FROM LOCAL SPACE
  @sc05 @smoke
  Scenario: Upload file scenario
    Given As user i should able click More tab
    When As user i should able to click announcement
    Then As User should be able to click on upload files icon
    Then As User upload files and pictures from local disks
    Then as user i should able to see the upload file is successful
# ATTACH LINK AND LINK TEXT
  @sc06 @smoke
  Scenario:attach link scenario
    Given As user i should able click More tab
    When As user i should able to click announcement
    Then As user i should able to click on link icon
    Then As user i should see link attaching window and enter text and link
# INSERT VIDEO SOURCE
  @sc07 @smoke
  Scenario: insert video scenario
    Given As user i should able click More tab
    When As user i should able to click announcement
    Then As user i should able to click insert video icon
    Then As user i should able to enter video source
# CLICK ON VISUAL EDITOR AND TOPICS
  @sc08 @smoke
  Scenario: Visual editor and topic Scenario
    Given As user i should able click More tab
    When As user i should able to click announcement
    Then As user i should able to click on Visual editor and topic
    Then As user i should able to see Visual editor and topic on top

# CLICK RECORD VIDEO
  @sc09 @smoke
  Scenario: Record video scenario
    Given As user i should able click More tab
    When As user i should able to click announcement
    Then As user i should able to click on record video
    Then As user i should able to click allow button to record



