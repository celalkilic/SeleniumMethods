package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_24_DropDownOptions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/reg/");
		driver.manage().deleteAllCookies();
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(month);
		Select select2 = new Select(day);
		Select select3 = new Select(year);
		
		// writing all values
		
		List<WebElement> monthOption = select.getOptions();
		System.out.println(monthOption.size());
		for (int i = 0; i < monthOption.size(); i++) {
			System.out.println(monthOption.get(i).getText());
		}
		System.out.println("*************************************");
		List<WebElement> dayOption = select2.getOptions();
		System.out.println(dayOption.size());
		for (int i = 0; i < dayOption.size(); i++) {
			System.out.println(dayOption.get(i).getText());
		}
		System.out.println("*************************************");
		List<WebElement> yearOption = select3.getOptions();
		System.out.println(yearOption.size());
		for (int i = 0; i < yearOption.size(); i++) {
			System.out.println(yearOption.get(i).getText());
		}
	}

}
