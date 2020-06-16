package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSSendKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
//		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// javascript have the power which works with dom stracture while a element isnot visible selenium will throw exception and cannot click but the javascript will do that
		// with executor
		//java is very powerful but when it comes to dom stracture it has less control but javascript has full contorl on dom stracture
		WebElement email = driver.findElement(By.name("username"));
		
		js.executeScript("arguments[0].value='rahida.hakim@yahoo.com'",email);
		
	
		
		// this way also it works
		
//		js.executeScript("arguments[0].value=arguments[1]", email, "rahida.hakim@gmail.com");
//		js.executeScript("arguments[0].value=arguments[1]"+ email+ "rahida.hakim@gmail.com");
		
		
		
		
	}

}
