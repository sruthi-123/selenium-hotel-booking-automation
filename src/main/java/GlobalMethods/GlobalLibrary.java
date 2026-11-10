package GlobalMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalLibrary {
	public static WebDriver driver;

	public static void loadWebDriver() {
		driver = new ChromeDriver();
	}

	public static void lauchWebUrl(String url) {
		driver.get(url);
	}

	public static void enterInput(WebElement webelement, String value) {
		webelement.sendKeys(value);
	}

	public static void clickElement(WebElement webElement) {
		webElement.click();
	}

	public static void select(WebElement dropdownElement, String option) {
		Select selectOption = new Select(dropdownElement);
		selectOption.selectByVisibleText(option);
	}

	public static String getAttributeValue(WebElement webelement, String attributeName) {
		String value = webelement.getAttribute(attributeName);
		return value;
	}

	public static void waits(WebElement webelement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(webelement));
	}
	public static void windows() {
		String originalWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {
			if (!windowId.equals(originalWindow)) {
				driver.switchTo().window(windowId);

			}
		}
	}

}
