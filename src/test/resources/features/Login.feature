Feature: Login Page Test Scenarios




@smoke
  Scenario: Login with Valid Credentials
    Given User navigates to website and verify login page title as "OpenEMR Login"
    When User enters valid username
    Then User enters valid password
    And User selects language as "English (Australian)"
    Then User clicks login button
    And User verifies Home Page title as "OpenEMR"