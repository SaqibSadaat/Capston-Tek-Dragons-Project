Feature: Retail Account Page
  
  Background: 
    Given User is on retail website
    When User click on sign in option
    And User enter email 'saqibtestuser@test.us' and password 'Tek@12345'
    And User click on login button
    And user should be logged in into Account
    When User click on Account option
    
  @updateProfileAndPhone #Need update before run
  Scenario: Verify User can update Profile Information
    #When User click on Account option
    And User update Name 'Saqib Sadaat' and Phone '916-123-5855'
    And User click on Update button
    Then user profile information should be updated
    
  @payment #Need update before run
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 2222333344445689 | Saqib Sadaat |              11 |           2027 |          123 |
    And User click on Add your Card button
    Then a message should be displayed Payment Method added successfully
    
@updateCrad #Need update before run
  Scenario: Verify User can edit Debit or Credit card
    And User select the payment Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 1568963541258745 | Saqib Sadaat |              9  |           2028 |          963 |
    And user click on Update Your Card button
    Then a message should be displayed Payment Method updated Successfully
    
 @removeCard
  Scenario: Verify User can remove Debit or Credit card
    And User select the payment Card
    And User click on remove option of card section
    Then payment details should be removed
    
@addNewAddress 
  Scenario: Verify User can add an Address
    #When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country      | fullName     | phoneNumber  | streetAddress | apt   | city       | state     | zipCode |
      | United States| Saqib Sadaat | 916-123-7654 | 6500 47th St  | 06    | Sacramento | California| 95823   |
    And User click Add Your Address button
    And a message should be displayed Address Added Successfully

@addressUpdated 
  Scenario: Verify User can edit an Address added on account
    #When User click on Account option
    And User click on edit address option
    And user update address form with below information
      | country        | fullName     | phoneNumber  | streetAddress | apt | city       | state      | zipCode |
      | United States  | Saqib Sadaat | 916-123-7654 | 5252 Mack Rd  | 123 | Sacramento | California | 95823  |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully
    
@removeAddress 
  Scenario: Verify User can remove Address from Account
    #When User click on Account option
    And User click on remove option of Address section
    #Then Address details should be removed
