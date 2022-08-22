package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_10_NameConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		By userName = By.name("username");
		By password = By.name("password");
		WebElement userElement = driver.findElement(userName);
		WebElement passWordElement = driver.findElement(password);
		userElement.sendKeys("clllffdffv");
		passWordElement.sendKeys("xdsddsdsds");
		

	}

}
