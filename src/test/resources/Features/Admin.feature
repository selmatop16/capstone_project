#Author
#Date
Feature: Admin


  Scenario Outline: Add a new Employee
    When User opens URL
    And User enters <username> and <password>
    And Click on Login
    Then user is navigated to the Dashboard page
    When clicks on Admin menu
    And admin enters system username
    And clicks search button
    And selects all system users
    And clicks reset button
    # And clicks delete button
   # And user clicks OK button in pop up to delete existing user
    And Click on Add button
    Then Select user role as Admin
    And Enter employee name
    And Enter username
    And Select Status as Enabled
    And Enter password
    And Enter confirm password
    And clicks on Cancel button
   # And Click on Save button
    And selects all system users
    Then Close browser


    Examples:
      | username | password    |
      | admin    | Hum@nhrm123 |