package Basics.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("alert('Welcome to Selenium')");
		
		
		
		
		
		
	}

}
