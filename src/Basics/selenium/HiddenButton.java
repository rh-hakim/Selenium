package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		
		
		
		// basically there will be some hidden element on the webpages and when you run it selenium will click on the first one which is hidden and you will get exception
		// the exception is called elementIsNotVisibleException
		
		// we can use the getloction() method to find the location and then gety() method as i saw in the video in youtube 
		// we wil use the findelements method and then we will put a for loop 
		//........
		
		
		
	}

}
