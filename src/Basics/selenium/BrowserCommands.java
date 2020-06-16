package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,	TimeUnit.SECONDS);
		
		
		//delete cookies or you can do delete all cookies before lounching the test case
		driver.manage().deleteAllCookies();
		
		//driver. get will get as to website 
		// driver.navigate.to get us to website address
		// diffrenece between both of them is
		   // whenever driver.get opens a website it gonna wait for website to open and then move to next stage or execution flow example it will open and wait to elements will be visible
		// while driver.navigate.to will open a website and will not wait and will move to next stage forexample will not wait and goes to next stage for next click
		
		driver.get("http://tek-school.com");
		
		// waot fpr 5 sec
		
		Thread.sleep(5000);
		
		
		driver.navigate().to("http://tek-school.com/retail");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
