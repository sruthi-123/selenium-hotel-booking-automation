package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GlobalMethods.GlobalLibrary;

public class HotelPageObject3 extends GlobalLibrary {

	public HotelPageObject3() {
		PageFactory.initElements(driver, this);
	} 

	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;

	@FindBy(id = "continue")
	private WebElement continueButton;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}