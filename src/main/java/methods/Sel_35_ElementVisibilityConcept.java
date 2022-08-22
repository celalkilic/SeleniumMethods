package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_35_ElementVisibilityConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/register");
		driver.manage().window().maximize();
		WebElement submitElement = driver.findElement(By.id("submitButton"));
		//isDisplayed
		//isEnapled
		//isSelected
		System.out.println("before submit button is enabled ");
		System.out.println(submitElement.isEnabled());
		System.out.println(submitElement.isDisplayed());
		System.out.println("24 line is "+driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected());
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		System.out.println("26 line is "+driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected());
		System.out.println("after submit button is enabled ");
		System.out.println(submitElement.isEnabled());
		System.out.println(submitElement.isDisplayed());

	}

}
