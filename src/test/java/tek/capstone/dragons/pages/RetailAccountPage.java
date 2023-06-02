package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;
import tek.capstone.dragons.utilities.CommonUtility;



public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "profileImage")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalUpdateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement successMessage;
	
	//locator for add payment method
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement AddaPaymentMethod;
	
	@FindBy(id="cardNumberInput")
	public WebElement CardInput;
	
	@FindBy(id="nameOnCardInput")
	public WebElement NameInput;
	
	@FindBy(id="expirationMonthInput")
	public WebElement MonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement YearInput;
	
	@FindBy(id="securityCodeInput")
	public WebElement SecurityInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement AddYourCardbtn;
	
	@FindBy(xpath="//div[text()=\"Payment Method added sucessfully\"]")
	public WebElement PaymentMethodAddedSuccessfully;
	
	//@updateCrad
	
	@FindBy(css="p.account__payment__sub-text")
	public WebElement SelectedpaymentCard;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement Edit;
	
	@FindBy(xpath="//input[@name='cardNumber']")
	public WebElement CardNumber;
	
	@FindBy(xpath="//input[@name='nameOnCard']")
	public WebElement NameOnCard;
	
	@FindBy(xpath="//input[@name='securityCode']")
	public WebElement SecurityCode;
	
	@FindBy(xpath="//button[text()='Update Your Card']")
	public WebElement UpdateCardBtn;
	
	@FindBy(xpath="//div[text()=\"Payment Method updated Successfully\"]")
	public WebElement PaymentMethodupdatedSuccessfully;
	
	// @removeCard
		//  Scenario: Verify User can remove Debit or Credit card
		
		@FindBy(xpath="//button[text()='remove']")
		public WebElement Remove;
		
		@FindBy(xpath="//p[text()='Add Address']")
		public WebElement AddAddress;
	
	// add address
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[3]/div[1]/div/div/p")
	public WebElement addAddressLink;
			
	@FindBy(xpath = "//*[@id=\"countryDropdown\"]")
	public WebElement countryDropdown;
			
	@FindBy(id = "fullNameInput")
	public WebElement addressNameInputField;
			
	@FindBy(id = "phoneNumberInput")
	public WebElement addressPhoneInputField;
			
	@FindBy(id = "streetInput")
	public WebElement addressStreetInputField;
			
	@FindBy(id = "apartmentInput")
	public WebElement addressAptInputField;
			
	@FindBy(id ="cityInput")
	public WebElement addressCityInputField;
			
	@FindBy(xpath = "//*[@id=\"newForm\"]/div[5]/div[2]/div/div/select")
	public WebElement addressStateInputField;
			
	@FindBy(id = "zipCodeInput")
	public WebElement addressZipCodeInputField;
			
	@FindBy(id ="addressBtn")
	public WebElement addressAddAddressBttn;
			
//	@FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
//	public WebElement addressAddedSuccessfullyMssg;
	
	@FindBy(xpath="//div[text()=\"Address Added Successfully\"]")
	public WebElement AddressAddedSuccessfully;
	
	//Edit credit or debit card 
	
	@FindBy(xpath ="/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[1]")
	public WebElement creditDebitCardEditBttn;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[1]")
	public WebElement eiditAddressBttn;
	
	@FindBy(xpath ="//*[@id=\"addressBtn\"]")
	public WebElement submitAddressBttn;
	
	 @FindBy(xpath = "//div[text()='Address Updated Successfully']")
	    public WebElement addressUpdatedMessage;
	//////////////////////////////////////////////////////
	
	 @FindBy(xpath = "//div[@class='account__address-btn-wrapper']//child::button[text()='Remove']")
	    public WebElement removeAddressButton;
	
	
	
	
		
	}
			
			

	
	
	
	
	
	
	
	
	
	
	
	

