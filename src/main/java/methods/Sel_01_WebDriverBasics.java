package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_01_WebDriverBasics {

	public static void main(String[] args) {
		// Set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeyne\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://siliconelabs.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//verification
		if (title.equals("Silicone Labs")) {
			System.out.println("test has passed ........................");
			System.out.println("correct title is "+title);
		}else {
			System.out.println("test has failed ........................");
			System.out.println("title is not correcet title");
		}
		driver.close();
	}

}
