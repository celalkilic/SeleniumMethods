package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Sel_44_HeadlessFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\zeyne\\Documents\\drivers\\geckodriver.exe");
		FirefoxOptions ff = new FirefoxOptions();
		ff.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(ff);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());

	}

}
