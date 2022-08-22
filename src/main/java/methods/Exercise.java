package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
		
		WebElement forgetPass = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginBtn.click();
		WebElement header = driver.findElement(By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module"));
		WebElement acoountName = driver.findElement(By.cssSelector(".oxd-userdropdown-name"));
		String headerString = header.getText();
		String accountString = acoountName.getText();
		System.out.println(headerString);
		System.out.println(accountString);
		

	}

}
