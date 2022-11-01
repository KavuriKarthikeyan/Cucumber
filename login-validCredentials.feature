
Feature: Feature to test login functionality

  Scenario: with valid credentials successful login
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
  