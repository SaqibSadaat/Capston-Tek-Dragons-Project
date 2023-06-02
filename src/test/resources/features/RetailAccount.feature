Feature: Retail Account Page
  
  Background: 
    Given User is on retail website
    When User click on sign in option
    And User enter email 'alijankhan@gmail.com' and password 'Aliza123*23'
    And User click on login button
    And user should be logged in into Account
    When User click on Account option
    
  @updateProfileAndPhone #PASSED WIH NO ISSUE
  Scenario: Verify User can update Profile Information
    #When User click on Account option
    And User update Name 'Ali Khannnskk' and Phone '203-101-8008'
    And User click on Update button
    Then user profile information should be updated
    
    #@ChangePassword #this scenario is not listed in the actul project
    #Scenario: Verify user can update password
    #And User entered below information
    #|Previouse password|New Password|Confirm Password|
    #|Aliza123*23|Aliza12*343|Ali*za12*343|
    #And User click on change password button
    #Then A message should be displayed password changed successfully 
  @payment
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7362853654617852 | Ranzoor     |              12 |           2025 |          657 |
    And User click on Add your Card button
    Then a message should be displayed Payment Method added successfully
    
@updateCrad
  Scenario: Verify User can edit Debit or Credit card
    And User select the payment Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7362859624952365 | Ali    |              12 |           2026 |          158 |
    And user click on Update Your Card button
    Then a message should be displayed Payment Method updated Successfully
    
 @removeCard
  Scenario: Verify User can remove Debit or Credit card
    And User select the payment Card
    And User click on remove option of card section
    Then payment details should be removed
    
@addNewAddress #passed with no issue
  Scenario: Verify User can add an Address
    #When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress | apt   | city  | state   | zipCode |
      |United States|ALi Ranzoor  |424-437-1548 |25625       |522    |Lomita |California|90717    |
    And User click Add Your Address button
    And a message should be displayed Address Added Successfully

@addressUpdated #passed with no issue
  Scenario: Verify User can edit an Address added on account
    #When User click on Account option
    And User click on edit address option
    And user update address form with below information
      | country       | fullName    | phoneNumber  | streetAddress | apt| city     | state      | zipCode |
      | United States   | AliAhmad    |252-352-5687 | 25417     | 60 | Torrance | California | 90945  |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully
    
@removeAddress #passed with no issue
  Scenario: Verify User can remove Address from Account
    #When User click on Account option
    And User click on remove option of Address section
    #Then Address details should be removed
