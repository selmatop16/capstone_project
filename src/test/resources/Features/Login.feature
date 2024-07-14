#Author
#Date
Feature: Admin

  Scenario: Add a new Employee
    When User opens URL
    And User enters <username> and <password>
    And Click on Login
    Then user is navigated to the Dashboard page