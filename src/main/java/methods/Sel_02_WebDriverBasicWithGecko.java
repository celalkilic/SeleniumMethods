package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_02_WebDriverBasicWithGecko {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\zeyne\\Documents\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		driver.close();
	}

}
