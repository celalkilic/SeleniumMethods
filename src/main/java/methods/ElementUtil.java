package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementUtil {
	/**
	 * this method is used to handle alert.
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
	// common Selenium methods
	public static WebDriver launchBrowser(WebDriver driver, String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browserName.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}else {
			System.out.println("browser is not avaliable "+browserName);
		}
		return driver;
	}
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);
	}
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();	
	}
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
