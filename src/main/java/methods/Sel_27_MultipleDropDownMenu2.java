package methods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_27_MultipleDropDownMenu2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		By dropBy = By.xpath("//span[@class='comboTreeItemTitle']");
		
		selectSingleValue(driver, dropBy, "choice 3");

	}
	public static void selectSingleValue(WebDriver driver,By locator, String value) {
		List<WebElement> dropList = driver.findElements(locator);
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			System.out.println(text);
			try {
				if (!text.isEmpty()) {
					if (text.equals(value)) {
						dropList.get(i).click();
						break;
					}	
				}
			} catch (Exception e) {
			
			}
		}
	}

}
