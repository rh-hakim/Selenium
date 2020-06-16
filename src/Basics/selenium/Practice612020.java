package Basics.selenium;

import java.util.concurrent.TimeUnit;

import javax.swing.Spring;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice612020 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://bankofAmerica.com");
		
		
		String siteTitle = driver.getTitle();
		if (siteTitle.equals(siteTitle)) {
			System.out.println("testing is on progress");
			
		} else {
			System.out.println("need more practice");
			
			
		}
	
		Thread.sleep(2000);
		
//		driver.quit();
		
		
		
		
		 
		
		

			
		}
	

	

}
