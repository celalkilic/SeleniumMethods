package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_48_DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		
		//first way usage
		//action.dragAndDrop(sourceElement, targetElement).build().perform();
		
		//second way usage
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		driver.close();
		//actions
		//.clickAndHold(sourceElement)
		//.moveToElement(targetElement)
		//.release()
		//.build()
		//.perform()
	}

}
