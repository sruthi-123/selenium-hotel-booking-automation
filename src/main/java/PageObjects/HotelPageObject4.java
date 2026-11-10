package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GlobalMethods.GlobalLibrary;

public class HotelPageObject4 extends GlobalLibrary {

	public HotelPageObject4() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement billingAddress;

	@FindBy(id = "cc_num")
	private WebElement creditCardNo;

	@FindBy(id = "cc_type")
	private WebElement credirCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;

	@FindBy(id = "book_now")
	private WebElement bookNow;
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCredirCardType() {
		return credirCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}


}
