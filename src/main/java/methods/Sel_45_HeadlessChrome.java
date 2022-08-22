package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sel_45_HeadlessChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeyne\\Documents\\drivers\\chromedriver.exe" );
		ChromeOptions cc = new ChromeOptions();
		cc.addArguments("--headless");
		WebDriver driver = new ChromeDriver(cc);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
	}

}
