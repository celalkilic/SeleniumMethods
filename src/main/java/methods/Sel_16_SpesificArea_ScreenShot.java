package methods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_16_SpesificArea_ScreenShot {
	static WebDriver driver;
	static WebElement element;
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.siliconelabs.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		element = driver.findElement(By.xpath("//img[@class = 'main-logo']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
		
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Point p = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		Rectangle rect = new Rectangle(width+221, height+55);
		BufferedImage img = null;
		img = ImageIO.read(screenShot);
		BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);
		ImageIO.write(dest, "png", screenShot);
		FileUtils.copyFile(screenShot, new File("C:\\Users\\zeyne\\Desktop\\celal\\pic.png"));
		driver.quit();
	}

}
