package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_14_LoginPageDemo {
	public static WebDriver driver;
	static By emailId = By.id("username");
	static By passWord = By.xpath("//input[@id='password']");
	static By loginBtn = By.cssSelector("#loginBtn");
	
	public static void main(String[] args) throws InterruptedException {
		String url = "https://app.hubspot.com/login";
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		Thread.sleep(4000);
		ElementUtil.getElement(driver, emailId).sendKeys("cll@sample.com");
		Thread.sleep(4000);
		ElementUtil.getElement(driver, passWord).sendKeys("12345678");
		Thread.sleep(4000);
		ElementUtil.getElement(driver, loginBtn).click();
		Thread.sleep(4000);
		ElementUtil.quitBrowser(driver);
		
		
		

	}

}
