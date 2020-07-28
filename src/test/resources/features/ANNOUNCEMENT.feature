Feature: Send announcement
  Agile Story:As a user, I should be able to send announcement from
  Announcement subheading from "More" under Activity Stream.
  Background: User is Logged In
    When I submit username and password
    Then I should be logged in
  @announcement
  Scenario: Send announcement Scenario
    When As user i should able click More tab under Activity Stream
    Then As user i should able to click announcement subheading and enter "This is the announcement!!"
    Then As user i should able to click send button

