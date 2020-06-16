package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://amazon.com");
		// so implicit wait is dynamic, as you open ebay or amazon they are big website and have lots of thing to load it so we use implicit wait to load the full page 
		// sometimes some application are slow, before selenium throwing exception we give some time to loaded once the page is loaded it will perform action
		// so if the wait time is 40 seconds and it opens in 2 seconds 38 other will ignore
		
		// implicit wait is global and for all elements available in page, example page is loaded some elements are still not visible and then selenium will give exception so 
		// therefore we use implict wait to tell seelenium at least wait for that amount of time before throwing exception
		
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}

}
