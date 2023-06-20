Feature: Test Feature

  @First
  Scenario: Verify Oppenheimer HomePage

    Given Browser is open
    And User is on Home page
    Then Verify HomePage is displayed


  Scenario: Verify CSVInput panel is displayed

    Given Browser is open
    And User is on Home page
    Then Verify Upload CSV panel is displayed

  Scenario: Verify CSVInput panel is displayed

    Given Browser is open
    And User is on Home page
    Then Verify Refresh Tax Relief button is displayed

  Scenario Outline: Verify CSVInput panel is displayed

    Given Browser is open
    And User is on Home page
    Then Verify "<NatID>"  gets Tax Relief "<Relief>"
  Examples:
    | NatID       | Relief  |
    | 111-$$$$$$$ | 720.00  |
    | 112-$$$$$$$ | 720.00  |
    | 124-$$$$$$$ | 720.00  |
    | 113-$$$$$$$ | 1520.00 |
    | 114-$$$$$$$ | 720.00  |

  Scenario: Verify Total Tax Relief panel is displayed

    Given Browser is open
    And User is on Home page
    Then Verify Total Tax Relief panel is displayed

  Scenario: Verify Dispense Now button is displayed

    Given Browser is open
    And User is on Home page
    Then Verify Dispense Now button is displayed

  Scenario: Verify Dispense Now button is displayed

    Given Browser is open
    And User is on Home page
    Then Click on Dispense Now button
    And Verify Cash Dispensed message is displayed
