package PomTest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebElement;

import GlobalMethods.GlobalLibrary;
import PageObjects.HotelPageObject1;
import PageObjects.HotelPageObject2;
import PageObjects.HotelPageObject3;
import PageObjects.HotelPageObject4;

public class HotelPom extends GlobalLibrary {

	public static void main(String[] args) throws IOException {
		loadWebDriver();
		Properties config = new Properties();

		try (FileInputStream file =
		        new FileInputStream("config.local.properties")) {
		    config.load(file);
		}
		lauchWebUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		//Step1
		HotelPageObject1 hotelobj1 = new HotelPageObject1();
		enterInput(hotelobj1.getUserName(), config.getProperty("username"));
		enterInput(hotelobj1.getPassword(), config.getProperty("password"));
		clickElement(hotelobj1.getLogIn());
		
		//Step2
		HotelPageObject2 hotelobj2 = new HotelPageObject2();
		select(hotelobj2.getLocation(), "Sydney");
		select(hotelobj2.getHotels(), "Hotel Sunshine");
		select(hotelobj2.getRoomType(), "Deluxe");
		select(hotelobj2.getRoomNos(), "2 - Two");
		enterInput(hotelobj2.getCheckInDate(), "18/12/2026");
		enterInput(hotelobj2.getCheckOutdate(), "20/12/2026");
		select(hotelobj2.getAdultsPerroom(), "2 - Two");
		select(hotelobj2.getChildsPerroom(), "1 - One");
		clickElement(hotelobj2.getClickSearch());
		//Step3
		HotelPageObject3 hotelobj3 = new HotelPageObject3();
		clickElement(hotelobj3.getRadioButton());
		clickElement(hotelobj3.getContinueButton());
		//Step4
		HotelPageObject4 hotelobj4 = new HotelPageObject4();
		enterInput(hotelobj4.getFirstName(), "Shriyaa");
		enterInput(hotelobj4.getLastName(), "Sundaram");
		enterInput(hotelobj4.getBillingAddress(), "Apartment 4, Wee Street,Glassgow,G89RT");
		enterInput(hotelobj4.getCreditCardNo(), "5896415635588444");
		select(hotelobj4.getCredirCardType(), "VISA");
		select(hotelobj4.getExpiryMonth(), "February");
		select(hotelobj4.getExpiryYear(), "2028");
		enterInput(hotelobj4.getCvvNumber(), "522");
		clickElement(hotelobj4.getBookNow());
		//Get Order Value
		WebElement orderNo = hotelobj4.getOrderNo();
		waits(orderNo);
		String orderValue = getAttributeValue(orderNo, "value");
		System.out.println("Order NO." + orderValue);
	}
}
