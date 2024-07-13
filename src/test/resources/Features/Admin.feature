#Author
#Date
Feature: Admin

  Scenario: Add a new Employee
    When User opens URL
    And User enters <username> and <password>
    And Click on Login
    Then user is navigated to the Dashboard page
    When User click on Admin menu
    And Click on Add new button
    Then User can view Add new user page
    When User enter employee info
    And Click on Save button
    Then User can view confirmation message "Succesfuly Saved"
    And Close browser