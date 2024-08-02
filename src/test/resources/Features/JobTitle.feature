#Date
Feature: Admin

  Scenario Outline: Add job titles
    When User opens URL
    And User enters <username> and <password>
    And Click on Login
    Then user is navigated to the Dashboard page
    When user clicks on Admin menu
    And users click on Job menu
    And selects Job Titles and clicks it
    And user clicks on add button
    When user fills the form from given sheetName <sheetName> and rowNumber <rowNumber>
    And user saves it

    Examples:
     |  username| password   | sheetName| rowNumber|
     | admin| Hum@nhrm123|JobTitles| 0        |
     |admin |Hum@nhrm123 | JobTitles| 1       |
