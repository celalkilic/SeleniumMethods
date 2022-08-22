package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_33_ExplicitlyWaitConcept2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		
		By helloWord = By.xpath("//div[@id='finish']/h4");
		
		By loading = By.id("loading");
		getElement(driver, helloWord, 15);
		getElement(driver, loading, 10);

	}
	public static WebElement getElement(WebDriver driver, By locator, int timeout) {
		waitForPresenceOFElement(driver, locator, timeout);
		WebElement element = driver.findElement(locator);
		return element;
	}
	public static WebElement waitForPresenceOFElement(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement element = driver.findElement(locator);
		String text = element.getText();
		System.out.println(text);
		return element;
	}

}
