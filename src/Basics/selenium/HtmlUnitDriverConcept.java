package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new HtmlUnitDriver();
		// html is a class which implements the Webdriver interface
		//before 3.x version it was part of selenium but not now
		
		
		//advantages of htmlbrowser
		//1.testing is happening behind the scene no browser is lounched
		//2. very fast execution of test cases are very fast it will improve performance of the script
		// limitation 
		// some times it will not work and it will not work for action class mousemovement and drag and drop
		// html driver is also called as ghost driver nothing is visible everything is happeingng behind the scene
		 // also this is called headless browser there is not head
		 
		
		// we have below type of headless browser
		// html driver--- in java
		//PhantomJS --- javascript
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// html unit driver is not available in selenium 3.x version
		//html unit driver to use this concept we have to download html download JAR file
		driver.get("http://facebook.com");
		
		System.out.println(driver.getTitle());
	}

}


		
		
		
		
