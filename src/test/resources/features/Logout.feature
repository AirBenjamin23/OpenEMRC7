Feature: Logout Page


  Background: Login with valid credentials
    Given User navigates to website and verify login page title as "OpenEMR Login"
    When User enters valid username
    Then User enters valid password
    And User selects language as "English (Australian)"
    Then User clicks login button
    And User verifies Home Page title as "OpenEMR"

    @smoke
  Scenario: User able to logout after Login
    Given User logouts when navigates to Home Page
    Given User navigates to website and verify login page title as "OpenEMR Login"
