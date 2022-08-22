package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_19_DropDownManu2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/reg/");
		driver.manage().deleteAllCookies();
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		selectDropDownValueByText(day, "15");
		selectDropDownValueByText(month, "May");
		selectDropDownValueByText(year, "2019");
		Thread.sleep(5000);
		driver.quit();

	}
	public static void selectDropDownValueByText(WebElement element, String value) {
		Select select1 = new Select(element);
		select1.selectByVisibleText(value);
	}
}
