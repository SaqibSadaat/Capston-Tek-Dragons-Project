Feature: Sign in/Sign Up Feature

  Background: 
    Given User is on retial website
    When User click on sign in option
    Then user should be logged in into Account

  @SignInRetial #passed
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'saqibtestuser@test.us' and password 'Tek@12345'
    And User click on login button

  @CreatAccountRetail #passed 
  Scenario: Verify user can create an account into Retial Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                 | password | confirmPassword |
      | Sadaat  | saqibtestuser@test.us | Saqib111 | Saqib111        |
    And User click on signUp button
    
    