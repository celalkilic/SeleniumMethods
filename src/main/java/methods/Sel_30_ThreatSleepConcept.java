package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_30_ThreatSleepConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		System.out.println("title is "+driver.getTitle());
		
		//thread sleep is not part of the Selenium
		//it is static wait 
		// it is used to slow down element or thread on a web page
		Thread.sleep(6000);
		System.out.println("title is "+driver.getTitle());

	}

}
