package methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_38_BrowserWindowPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> iterator = handle.iterator();
		String parentWindowId = iterator.next();
		System.out.println("this is parent window "+parentWindowId);
		String childWindowId = iterator.next();
		System.out.println("this is child window "+childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is "+driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("child window title is "+driver.getTitle());
		driver.close();
	}

}
