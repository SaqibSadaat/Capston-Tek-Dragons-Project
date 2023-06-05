package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;


public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().account);
		logger.info("user clicked on Account option");
	 
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput,nameValue);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput,phoneValue);
		logger.info("user updated the name and the phone value");

	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateButton);
		logger.info("user clicked on update button");
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().successMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().successMessage));
		logger.info("user profile information updated");
	}
	
	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink () {
		click(factory.accountPage().AddaPaymentMethod);
		logger.info("user clicked on Add Payment");	
	}
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInfo (DataTable data ) {
		List<Map<String, String>> debitOrcredit =data.asMaps(String.class,String.class);
		sendText(factory.accountPage().CardInput,debitOrcredit.get(0).get("cardNumber"));
		sendText(factory.accountPage().NameInput,debitOrcredit.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().MonthInput,debitOrcredit.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().YearInput,debitOrcredit.get(0).get("expirationYear"));
		sendText(factory.accountPage().SecurityInput,debitOrcredit.get(0).get("securityCode"));
			
	}
	@And("User click on Add your Card button")
	public void userClickOnAddYoutCardBtn () {
		click(factory.accountPage().AddYourCardbtn);
		logger.info("user clicked on add card btn");	
	}

	@Then("a message should be displayed Payment Method added successfully")
	public void aMsgShouldBeDisplayed() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodAddedSuccessfully));
		logger.info("Payment Method added successfully");
	}
	
	//@updateCrad
	
	@And("User select the payment Card")
	public void userSelectedThePaymentCard() {
		click(factory.accountPage().SelectedpaymentCard);
		logger.info("User clicked on payment card");
		slowDown();
	}
	@And("User click on Edit option of card section")
	public void userClickonEditOption () {
		click(factory.accountPage().Edit);
		logger.info("user clicked on Edit");
		
	}
	
	@And("user edit information with below data")
	public void userEnterTheData(DataTable data) {
		clearTextUsingSendKeys(factory.accountPage().CardNumber);
		clearTextUsingSendKeys(factory.accountPage().NameOnCard);
		clearTextUsingSendKeys(factory.accountPage().SecurityCode);
		
		
		List<Map<String, String>> editBttn =data.asMaps(String.class,String.class);
		
		sendText(factory.accountPage().CardNumber,editBttn.get(0).get("cardNumber"));
		sendText(factory.accountPage().NameOnCard,editBttn.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().MonthInput,editBttn.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().YearInput,editBttn.get(0).get("expirationYear"));
		sendText(factory.accountPage().SecurityCode,editBttn.get(0).get("securityCode"));
		logger.info("user successfully entred the info");
		slowDown();
	}
	
	@And("user click on Update Your Card button")
	public void userClickonUpdateBttn () {
		click(factory.accountPage().UpdateCardBtn);
		logger.info("user clicked on updateBttn");
	}
	
	@Then("a message should be displayed Payment Method updated Successfully")
	public void aMessageShouldBeDisplayed() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodupdatedSuccessfully));
		logger.info("Payment Method added successfully");
	
	}
	
	//@removeCard
		//  Scenario: Verify User can remove Debit or Credit card
		
		@And("User click on remove option of card section")
		public void userClickOnRemoveCardfromList () {
			click(factory.accountPage().Remove);
			logger.info("User clicked on remove option");
			slowDown();
			
		}
		
		@Then("payment details should be removed")
		public void paymentdetailsShouldBeRemoved () {
		//	Assert.assertTrue(isElementDisplayed(factory.accountpage().Account)); There is no msg to validate.
			logger.info("Details removed successfully");
		}
		
		
	// add address 
		
		@When("User click on Add address option")
		public void userClickOnAddAddressOption() {
			click(factory.accountPage().addAddressLink);
			logger.info("Add Address Link Clicked successfully");
		}
		    
		@And("user fill new address form with below information")
		public void userFillTheInformation(DataTable data) {
		List<Map<String, String>> fillAddress = data.asMaps(String.class,String.class);

		selectByVisibleText(factory.accountPage().countryDropdown,fillAddress.get(0).get("country"));
		sendText(factory.accountPage().addressNameInputField,fillAddress.get(0).get("fullName"));
		sendText(factory.accountPage().addressPhoneInputField,fillAddress.get(0).get("phoneNumber"));
		sendText(factory.accountPage().addressStreetInputField,fillAddress.get(0).get("streetAddress"));
		sendText(factory.accountPage().addressAptInputField,fillAddress.get(0).get("apt"));
		sendText(factory.accountPage().addressCityInputField,fillAddress.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInputField,fillAddress.get(0).get("state"));
		sendText(factory.accountPage().addressZipCodeInputField,fillAddress.get(0).get("zipCode"));
		logger.info("User filled the field");
		slowDown();
		
		}
		@When("User click Add Your Address button")
		public void userClickAddYourAddressButton() {
			click(factory.accountPage().addressAddAddressBttn);
			logger.info("Add Address button was clicked successfully");
		}
	   @And("a message should be displayed Address Added Successfully")
			public void aMessageShouldBeDisplayedonScreen() {
				slowDown();
				Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccessfullyMssg));
				logger.info("Address Added Successfully");
				
			}
		    


		// Edit credit debit card 
		
//		@And("User select the payment Card")
//		public void userSelectedThePaymentCard() {
//		click(factory.accountPage().SelectedpaymentCard);
//		logger.info("User clicked on payment card");
//		slowDown();
//		}
//		
//		@And("User click on Edit option of card section")
//		public void userClickonEditOption () {
//		click(factory.accountPage().creditDebitCardEditBttn);
//		logger.info("user clicked on Edit");
//		   
//		}
//		
//		@And("user edit information with below data")
//		public void userEnterTheData(DataTable data) {
//		clearTextUsingSendKeys(factory.accountPage().CardInput);
//		clearTextUsingSendKeys(factory.accountPage().nameCardInputField);
//		clearTextUsingSendKeys(factory.accountPage().securityCode);
//
//
//		List<Map<String, String>> editBttn =data.asMaps(String.class,String.class);
//
//		sendText(factory.accountPage().CardInput,editBttn.get(0).get("cardNumber"));
//		sendText(factory.accountPage().nameCardInputField,editBttn.get(0).get("nameOnCard"));
//		selectByVisibleText(factory.accountPage().expiratiMonthInput,editBttn.get(0).get("expirationMonth"));
//		selectByVisibleText(factory.accountPage().expiratiYear,editBttn.get(0).get("expirationYear"));
//		sendText(factory.accountPage().securityCode,editBttn.get(0).get("securityCode"));
//		logger.info("user successfully entred the info");
//		slowDown();    
//		}
//		
//		@And("user click on Update Your Card button")
//		public void userClickonUpdateBttn () {
//		click(factory.accountPage().paymentSubmitBtn);
//		logger.info("user clicked on updateBttn");
//		   
//		}
//		
//		@Then("a message should be displayed Payment Method updated Successfully")
//		public void aMessageShouldBeDisplayed() {
//		slowDown();
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedSuccessfully));
//		logger.info("Payment Method added successfully");

//		}
		
		//@addressUpdated 
		
		@When("User click on edit address option")
		public void userClickOnEditAddressOption() {
			click(factory.accountPage().eiditAddressBttn);
			logger.info("Edit button was clicked successfully");
		    
		}
		
		@And("user update address form with below information")
		public void userFillNewAddressFormWithBelowInformation(DataTable Data) {
		List<Map<String, String>> EditNewAdd = Data.asMaps(String.class,String.class);

		selectByVisibleText(factory.accountPage().countryDropdown,EditNewAdd.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().addressNameInputField);
		sendText(factory.accountPage().addressNameInputField,EditNewAdd.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().addressPhoneInputField);
		sendText(factory.accountPage().addressPhoneInputField,EditNewAdd.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().addressStreetInputField);
		sendText(factory.accountPage().addressStreetInputField,EditNewAdd.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().addressAptInputField);
		sendText(factory.accountPage().addressAptInputField,EditNewAdd.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().addressCityInputField);
		sendText(factory.accountPage().addressCityInputField,EditNewAdd.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInputField,EditNewAdd.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().addressZipCodeInputField);
		sendText(factory.accountPage().addressZipCodeInputField,EditNewAdd.get(0).get("zipCode"));
		logger.info("User filled the field");
		slowDown();
		
		}

		@And("User click update Your Address button")
		public void userClickUpdateYourAddressBtn() {
		click(factory.accountPage().submitAddressBttn);
		logger.info("User clicked on Update Your Address");
		}
		

		@Then("a message should be displayed Address Updated Successfully")
		public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
	    slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedMessage));
		logger.info("Your New Address Updated");
		}
		///////////////////////////////////////////////////
		
		@When("User click on remove option of Address section")
		public void userClickOnRemoveOptionOfAddressSection() {
			click(factory.accountPage().removeAddressButton);
			logger.info("Remove button clicked successfully");
		}
		@Then("Address details should be removed")
		public void addressDetailsShouldBeRemoved() {
			click(factory.accountPage().removeAddressButton);
			logger.info("Address Remove clicked successfully");
		   
		}

}