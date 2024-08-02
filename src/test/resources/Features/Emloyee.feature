#Author
#Date
Feature: Add Employee

  Scenario Outline: Add a new Employee Users
    When User opens URL
    And User enters <username> and <password>
    And Click on Login
    Then user is navigated to the Dashboard page
    When user clicks on PIM menu
    And user click on Add  Employee
    And user enters <firstname>, <middleName>,and <lastname>
    Then enters <employeeId>
    And click on check box
    And upload a file
    And enter <username2>,<password2> and <confirm password>
    And add status as Enabled
    Then click on save button

    Examples:
      | username | password  | firstname| middleName| lastname| employeeId|username2 | password2  |confirm password|
      | admin    | Hum@nhrm123 | Joe    | Mike      | Cooper  | 94188919  |MikeCooper| Coper123456*!::|Coper123456*!:: |