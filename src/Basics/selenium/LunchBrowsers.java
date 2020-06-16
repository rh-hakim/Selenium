package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowsers {

	public static void main(String[] args) throws InterruptedException {

		// 1. Setup System Property 
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe" );
		
		//2. We need to use Webdriver Interface to lunch chrome Browser
		
		// we need the apis to lunch the browsers in selenium
		
		WebDriver driver = new ChromeDriver();
		// manage driver : will open the browser in full screen before it go to the browser
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		// pageload time out: in order to handle timeout we use the below method
		// it tells the driver if the page is opening before opening it wait for seconds before throwing timeout exception for pageload
				// so basically this is the hard break
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		// the other type of time wait is Implicit time wait:
		// Omplicit Time Wait: means we have three type in selenuim , it applies for entire executation time before driver throws an error. 
		//it gives us some time before throwing an exception it wiats for certain time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// while thread.sleep will wait for 5 seconds 
		
		
		
		// basically we create an object which implements chrom
		
		// lunch chrome browser to navigate to http://tek-school.com/retail/
		//.get method is used to lunch a website
		driver.get("http://tek-school.com/retail/");
		
		// get title page return a string and we can verify if we are in correct page.
		String siteTitle= driver.getTitle();
		System.out.println(siteTitle);
		
		
		// add a hard break
		Thread.sleep(5000);
		// to ways to close a driver
		// what is between the below two method is the diffrences?
	
		// drive.close : will close only one window which opened by webdriver
		// driver.quite: will close all windows opened by webdriver
		
		driver.close();
//		driver.quit();
		

		
		
		
	}

}
