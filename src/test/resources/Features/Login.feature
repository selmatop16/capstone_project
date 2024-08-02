#Author
#Date
Feature: login

  Scenario Outline: Login negative test
    When User opens URL
    And User enters <wrongUsername> and <password>
    And Click on Login
    Then user sees "Invalid credentials" message

    Examples:
      | wrongUsername | password  |
      | wrongUsername    | Hum@nhrm123 |

  Scenario Outline: Login
    When User opens URL
    And User enters <username> and <password>
    And Click on Login
    Then user is navigated to the Dashboard page

    Examples:
      | username | password  |
      | admin    | Hum@nhrm123 |