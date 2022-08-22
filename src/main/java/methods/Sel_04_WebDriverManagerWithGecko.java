package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_04_WebDriverManagerWithGecko {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com");
		String title = driver.getTitle();
		System.out.println(title);
		//verification
		if (title.equals("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
			System.out.println("test has passed ........................");
			System.out.println("correct title is "+title);
		}else {
			System.out.println("test has failed ........................");
			System.out.println("title is not correcet title");
		}
		driver.close();	

	}

}
