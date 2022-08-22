package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_46_CustomXpath {

	public static void main(String[] args) {
		//Xpath is used to find the location of any element on a webpage using the HTML structure
		//Absolute Xpath: starts with a single slash(/)starting from the root element and all the way to the element
		//Relative Xpath: starts with a double slash(//)starting, selection, matching anywhere in the document
		//Absolute Xpath: html/body/div/div[5]/dic[2]/li/div[1]/a
		//Relative CXpath://tagname[@atribute='value']
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/");
		
		//Basic XPath:
		//==================================
		
		//USER ID
		
		//input[@name='uid']
		//input[@type='text']
		//input[@onkeyup='validateuserid();']
		
		//LOGIN
		
		//input[@name='btnLogin']
		//input[@value='LOGIN']
		
		
		// contains()
		//contains is used for or dynamic elements properties
		//===================================
		
		//LOGIN AND RESET
		
		//*[contains(@type, 'reset')]
		//*[contains(@type, 'sub')]
		
		// USERNAME MESSAGE
		//*[contains(@id, 'message23')]
		
		//visit here
		//a[contains(text(), 'here')]
		//a[contains(@href, 'guru99.com')] 14
		
		//Using OR and AND
		//=====================================
		//input[@type='submit' or @name='btnReset'] 2
		//input[@type='submit' or @name='btnLogin']
		
		// starts-with function 
		//======================================
		//User-ID must not be blank
		//label[starts-with(@id, 'message')]
		
		// ends-with function 
		//======================================	
		//label[starts-with(@id, 'message')]
		
		
		//text()
		//UserID
		//td[text()='UserID']
		
		//following
		//=========================================
		//Password - LOGIN and RESET
		//*[@type='password']//following::input
		//*[@type='password']//following::input[1]
		//*[@type='password']//following::input[2]
		
		// ancestor axis
		//================================
		//https://www.guru99.com/
		//Testing
		//*[text()='Testing']//ancestor::div
		//*[text()='Testing']//ancestor::div[1]
		
		// child
		//==================================
		//*[@id='java_technologies']//child::li
		//*[@id='java_technologies']//child::li[1]
		
		// preceding
		//=================================
		//LOGIN
		//*[@type='submit']//preceding::input
		
		// following-sibling
		//====================================
		//LOGIN
		//*[@type='submit']//following-sibling::input
		
		//parent
		//===============================
		//ul[@id='java_technologies']//parent::div
		
		
		// self
		//===============================
		//*[@type='password']//self::input

	}

}
