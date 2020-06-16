package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// for simualting going back and coming back to the websites we use navigations with back and forward method 
		
		
		// what is diffrence between driver.get and driver.navigate?
		   //driver.navigate is mean whatever external url you are using it will navigate you to that . you want to move to another one you use driver.navigate method 
		// both of them use to lounch url but navigate is used to lounch external 
		
		
		driver.get("http://google.com");
		
		driver.navigate().to("http://amazon.com");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		driver.navigate().forward();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		String outputhPath = ("C:\\Users\\Raheda Hakim\\Documents\\JavaTraining\\SeleniumProject.Feb2020\\output\\");
		ScreenShotUtility.screenShot(driver, outputhPath, "Navigation");

		// for refresh we also use navigate method
		
		driver.navigate().refresh();
		
		
		
		
		
	}

}
