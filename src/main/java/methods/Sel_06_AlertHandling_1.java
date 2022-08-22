package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_06_AlertHandling_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// locator
		WebElement signOnBtn = driver.findElement(By.name("proceed"));
		signOnBtn.click();
		
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		
		if (alertText.equals("Please enter a valid user name")) {
			System.out.println("correct alert text");
			alert.accept();
		}else {
			System.out.println("incorrect alert text");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
