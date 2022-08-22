package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_31_ImplicitlyWaitConcept {

	public static void main(String[] args) {
		// this wait tells WebDriver to wait if the element is not available immediately and 
		//WebDriver waits till the element is visible in specified time
		//it throws NoSuchElementException
		//Implicitly wait works only element does not work with non-element
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("visibleAfter"));
		if (element.isEnabled()) {
			element.click();
			System.out.println(element.isEnabled());
		}else {
			System.out.println(!element.isEnabled());
		}
	}

}
