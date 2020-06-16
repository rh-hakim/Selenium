package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleJSE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("procced")).click();
		
		// now pop up will show so now i have to get the text then have to click on ok button
		// first switch from one to another
		
		Alert alert = driver.switchTo().alert();// we import alert class from selenium as weell like action
		System.out.println(alert.getText());
		
		alert.accept(); // by accepting it will accept and clicks on ok
//		alert.dismiss(); // but most of the time there is no cancel button
		
		
		
			
	}

}
