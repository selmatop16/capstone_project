#Author
#Date
Feature: login

  Scenario Outline: Login
    When User opens URL
    And User enters <username> and <password>
    And Click on Login
    Then user is navigated to the Dashboard page

    Examples:
      | username | password  |
      | admin    | Hum@nhrm123 |