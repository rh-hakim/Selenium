package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement email1= driver.findElement(By.id("email"));
		email1.sendKeys("hakim@yahoo.com");
		
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("guesswhat");
		
		WebElement login= driver.findElement(By.xpath("\\input[@type='submit']"));
	login.click();
	System.out.println("password is wronw");

		
		Thread.sleep(4000);
		
		
		
		
//		WebElement email = driver.findElement(By.id("//*[@id=\"login-username\"]"));
//		WebElement next = driver.findElement(By.xpath("\\input[@value='Next']"));
//		
//		
//		
////		WebElement email=	driver.findElement(By.id("\\input[@id='login-username']"));
////		WebElement nexty=	driver.findElement(By.id("\\input[@value='next']"));
//		
//		
//
//
//		//*[@id="login-username"]
//		
		

	}

}
