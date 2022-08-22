package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_40_JavaScriptExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https:\\darksky.net");
		//driver.manage().window().maximize();
		//System.out.println(JavaScripUtil.getTitleByJS(driver));
		//JavaScripUtil.scrollPageDown(driver);
		//JavaScripUtil.specificScrollPageDown(driver);
		//System.out.println(JavaScripUtil.getPageInnerText(driver));
		//JavaScripUtil.refreshBrowserByJS(driver);
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		//WebElement signUpBtn = driver.findElement(By.linkText("Sign up"));
		//JavaScripUtil.clickElementByJS(signUpBtn, driver);
		//JavaScripUtil.drawBorder(signUpBtn, driver);
		//WebElement email = driver.findElement(By.id("username"));
		//WebElement password = driver.findElement(By.id("password"));
		//WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		//JavaScripUtil.flash(driver.findElement(By.id("username")), driver);
		//JavaScripUtil.sendKeysUsingJSWithID(driver, "username", "cll.sample@gmail.com");
		//JavaScripUtil.flash(driver.findElement(By.id("password")), driver);
		//JavaScripUtil.sendKeysUsingJSWithID(driver, "password", "cllklclslndmdk");
		//JavaScripUtil.flash(loginBtn, driver);
		//loginBtn.click();
		String browserInfo = JavaScripUtil.getBrowserInfo(driver);
		System.out.println(browserInfo);

	}

}
