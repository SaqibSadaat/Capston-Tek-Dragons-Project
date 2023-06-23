package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderPage extends CommonUtility {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropdown;
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	@FindBy(id ="searchBtn")
	public WebElement searchBttn;
	@FindBy(xpath ="/html/body/div/div[1]/div[1]/div[3]/div/div/img")
	public WebElement kasaOutdoorSmartPlugItem;
	@FindBy(xpath ="/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select")
	public WebElement productQtyDropdown;
	@FindBy(xpath= "/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/button/span")
	public WebElement addToCartBttn;
	@FindBy(xpath = "//*[@id=\"cartQuantity\"]")
	public WebElement cartQtyField;
	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBttn;
    @FindBy(xpath ="//*[@id=\"placeOrderBtn\"]")
    public WebElement placeOrderBttn;
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
	public WebElement orderPlacedSuccessfulyMssg;
	@FindBy(xpath ="/html/body/div/div[1]/div[1]/div[3]/div/div/p[1]")
	public WebElement apexLegendsItem;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div/div[1]/p")
	public WebElement orderPlacedThanks;
	
	//Background:
    @FindBy(id="signinLink")
	public WebElement signIn;
	@FindBy(id="email")
	public WebElement emailField;
	@FindBy(id="password")
	public WebElement passwrodField;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement logIn;
	@FindBy(id="orderLink")
	public WebElement orderbttn;
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement showdetails;
	@FindBy(id ="orderLink")
	public WebElement orderLink;
	
	// @CancelOrder
	//  Scenario: Verify User can cancel the order	
	@FindBy(id="cancelBtn")
    public WebElement cancelbttn;		
	@FindBy(id="reasonInput")
    public WebElement reason;		
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrderBttn;		
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderHasBeenCancelled;
				
			
	// @ReturnOrder
    //  Scenario: Verify User can Return the order	
	@FindBy(id="returnBtn")
	public WebElement returnbtn;		    
	@FindBy(id ="reasonInput")
    public WebElement inputreason;	    
    @FindBy(id = "dropOffInput")
	public WebElement dropOfInput;		    
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnButton;		    
//    @FindBy(xpath="//p[text()='Return was successfull']")
//    public WebElement yourOrderReturn;


    //@WrittingReview
	// Scenario: Verify User can write a review on order placed    
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;	    
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;	    
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;	    
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;	    
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement Msg;
			
	 
	}