package methods;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_34_FluentWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(), 'Click Me - Fluent Wait')]")).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchMethodException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				WebElement element = driver.findElement(By.id("demo"));
				String getTextPage = element.getText();
				if (getTextPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println("text "+ getTextPage);
					return element;
				}else {
					System.out.println("title is wrong...");
					return null;
				}
			}
		});
	}

}
