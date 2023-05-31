@RetialSignIn/SingUpScenario
Feature: Sign in/Sign Up Feature

  Background: 
    Given User is on retial website
    When User click on sign in option
    Then user should be logged in into Account

  @SignInRetial #passed with no issue
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'alijankhan@gmail.com' and password 'Aliza123*'
    And User click on login button

  @CreatAccountRetail # passed with no issue
  Scenario: Verify user can create an account into Retial Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                    | password | confirmPassword |
      | student | alikhanjanttu@tekschool.us | Aliza123 | Aliza123        |
    And User click on signUp button
    
    