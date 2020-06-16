package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
//		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
//		js.executeScript("document.getElementById('persistent').click ()");
		
//		js.executeScript("document.getElementById('persistent'), (document.getElementById('persistent').JSClick()");
//		
//		js.executeScript("document.getElementsByTagNameNS('   ').click()");
//		
		// we can try with this method as well the click by JAVASCRIPt
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));
		js.executeScript("arguments[0].click()", checkbox);
		
		
		
		driver.get("http://outlook.live.com");

		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
				WebElement signinButton = driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a"));
				
				js.executeScript("argument[0].click()", signinButton);
				
				
				
				
		
	}

}
