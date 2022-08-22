package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_20_DropDownManu3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/reg/");
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		selectDropDownValueBytext(driver, day, "19");
		selectDropDownValueBytext(driver, month, "Jun");
		selectDropDownValueBytext(driver, year, "2019");
		quitBrowser(driver);

	}
	
	public static void selectDropDownValueBytext(WebDriver driver, By locator, String value) {
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	public static WebElement getElement(WebDriver driver, By locator ) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}
