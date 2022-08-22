package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_26_MultipleDropDownMenu1 {

	public static void main(String[] args) {
		// select all values from DropDown
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			if (!text.isEmpty()) {
				System.out.println(text);
				//dropList.get(i).click();
			}
			if (text.equals("choice 6 2 1")) {
				dropList.get(i).click();
				break;
			}
		}
	}

}
