package MethodsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {

		//isDisplayed is the method used to verify presence of a web element within the webpage, 
		// the method return a true value if the specified web element is present on the webpage and false when it is not present
		
		//isdisplayed is capable to check for the presence of all kinds of web elements available
		
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");

	boolean b1=	driver.findElement(By.xpath("//button[@name='websubmit']")).isDisplayed(); // is the signup button is available on page or not?
	
	System.out.println(b1);
	
	
		
	}

}
