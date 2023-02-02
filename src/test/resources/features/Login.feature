Feature: Login Page Test Scenarios


@smoke
  Scenario: Login with Valid Credentials
    Given User navigates to website and verify login page title as "OpenEMR Login"
    When User enters valid username
    Then User enters valid password
    And User selects language as "English (Australian)"
    Then User clicks login button
    And User verifies Home Page title as "OpenEMR"


  @smoke
  Scenario: Login with invalid username
    Given User navigates to website and verify login page title as "OpenEMR Login"
    When User enters invalid username
    Then User enters valid password
    And User selects language as "English (Australian)"
    Then User clicks login button
    And User gets user friendly error message as "Invalid username or password"

    @smoke1
    Scenario: Login with invalid password
      Given User navigates to website and verify login page title as "OpenEMR Login"
      When User enters valid username
      Then User enters invalid password
      And User selects language as "English (Australian)"
      Then User clicks login button
      And User gets user friendly error message as "Invalid username or password"
