package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GlobalMethods.GlobalLibrary;

public class HotelPageObject1 extends GlobalLibrary {
	
	public HotelPageObject1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement logIn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogIn() {
		return logIn;
	}

}
