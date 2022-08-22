package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_29_WebTableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		int rowCount = getTableCount(driver);
		
		String beforeXpathCompany = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpathCompany = "]/td[1]";
		String beforeXpathContact = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpathContact = "]/td[2]";
		String beforeXpathCountry = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpathCountry = "]/td[3]";
		
		getColumnData(driver, beforeXpathCompany, afterXpathCompany);
		System.out.println("************************");
		getColumnData(driver, beforeXpathContact, afterXpathContact);
		System.out.println("************************");
		getColumnData(driver, beforeXpathCountry, afterXpathCountry);

	}
	public static int getTableCount(WebDriver driver ) {
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount = rowList.size();
		return rowCount;
	}
	public static void getColumnData(WebDriver driver, String beforeXpath, String afterXpath) {
		for (int rowNum = 2; rowNum <= getTableCount(driver); rowNum++) {
			String actualXpath = beforeXpath+rowNum+afterXpath;
			//System.out.println(actualXpath);
			String text = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
		}
	}

}
