package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		// for makind headless we have two thing to implement
		// ChromeOptions class we create object of this class
		// called ghost broswer
		

		//headless browsers are browsers which opens but we cant see them
		//usaully used in client 
		ChromeOptions options =new ChromeOptions();
		// for this class we have one method to have argument
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		
		
		// and now you have to pass the options to the WebDriver driver object in the paranthesis
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://facebook.com");

		System.out.println(driver.getTitle());
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(6000);
	}

}
