package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_37_AuthPopConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		//first solution
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//second solution
		String userName = "admin";
		String passWord = "admin";
		driver.get("http://"+userName+":"+passWord+"@the-internet.herokuapp.com/basic_auth");

	}

}
