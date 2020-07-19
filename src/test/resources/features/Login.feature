Feature: Login
  Agile story: as user i should use valid credential i should able
  to successfully login and see the dashboard.

  @smoke @failTest
  Scenario:Login scenario
    When User login as valid username and password
      | helpdesk29@cybertekschool.com | UserUser |

    Then User should able to see dashboard