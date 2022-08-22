package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_09_ClassName {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By userName = By.className("login-email");
		By passWord = By.className("m-bottom-3");
		// uiButton private-button private-button--primary private-button--default m-bottom-4 login-submit private-button--non-link
		By loginBtn = By.className("login-submit");
		ElementUtil.getElement(driver, userName).sendKeys("cll@gmail.com");
		ElementUtil.getElement(driver, passWord).sendKeys("12345vdewdc");
		ElementUtil.getElement(driver, loginBtn).click();
		ElementUtil.quitBrowser(driver);

	}

}
