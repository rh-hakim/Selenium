package MethodsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {

		//this method is to verify if the web element is enalbled or disaable on the webpage
		// is enabled is primarily used with buttons
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");

		boolean b1=	driver.findElement(By.xpath("//button[@name='websubmit']")).isEnabled();
		System.out.println(b1); // by the time i accept the terms and condition i will check back the bottun then it will return false or true so this is a good example for the interview
		
		
	}

}
