package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GlobalMethods.GlobalLibrary;

public class HotelPageObject2 extends GlobalLibrary {

	public HotelPageObject2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement roomNos;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(id = "datepick_out")
	private WebElement checkOutdate;

	@FindBy(id = "adult_room")
	private WebElement adultsPerroom;

	@FindBy(id = "child_room")
	private WebElement childsPerroom;

	@FindBy(id = "Submit")
	private WebElement clickSearch;

	@FindBy(id = "Reset")
	private WebElement clickReset;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutdate() {
		return checkOutdate;
	}

	public WebElement getAdultsPerroom() {
		return adultsPerroom;
	}

	public WebElement getChildsPerroom() {
		return childsPerroom;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}

	public WebElement getClickReset() {
		return clickReset;
	}

}
