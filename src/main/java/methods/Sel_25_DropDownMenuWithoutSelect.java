package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_25_DropDownMenuWithoutSelect {

	public static void main(String[] args) {
		
		// interview question 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/reg/");
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']/option"));
		for (int i = 0; i < dayList.size(); i++) {
			String text = dayList.get(i).getText();
			if (text.equals("17")) {
				dayList.get(i).click();
				break;
			}
		}
	}

}
