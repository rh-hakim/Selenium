package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTestByJS {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://spicejet.com");
		
		
		WebElement date= driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date1\"]"));
		String dateVal = "28-06-2020";
		
		selectDateByJS(driver, date, dateVal);
		
		
		
		
	}
	
	
	public static void selectDateByJS(WebDriver driver, WebElement date, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",date);
		
		

		
	}
	
	

}
