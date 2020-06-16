package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginToCanvas {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://canvas.instructure.com/login/canvas");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// we need to find email, passwoed and login
		// to find the above element in ui page we will use .findelement() method
		// the locater we are passing is id
		
		
	WebElement email=	driver.findElement(By.id("pseudonym_session_unique_id")); // 
	
	WebElement password = driver.findElement(By.id("pseudonym_session_password"));
	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
	
	// now how we can find and send the values
	
	// to send a value we will use sendkeys method
	// to click on a button or element we will use .clickmethod()
	
	email.sendKeys("rh.hakim2020@gmail.com");
	password.sendKeys("Confirmpc231.");
	loginButton.click();
	
	
	
		
		
	}

}
