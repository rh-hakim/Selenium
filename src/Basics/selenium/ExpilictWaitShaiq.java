package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilictWaitShaiq {

	public static void main(String[] args) {

		//implicit wait this wait is set on overall of webdriver execution before throwing an exceptiono
		//explicit this wait is set for specifi element before webdriver throws an exception
		// for example ; wait for until that to the element should be visible or clickable
		       //fluent wait will tell the browser to wait setting fluent wait to handle ElementNotVisibleException it comes under explicit
		
		//explicit waitw we can use for single element can be
		   //element to beclickable
		    ///element tobepresent
		    /// element tobevisible
		   ///etc
		
		//what is differecne between explicit and implicit wait
		// ans: implicit wait applies to entire webdriver execution and webdriver will throw exception before certain time
		// explicit wait applies to specific element and time sets for that element before sending exception and handling ajax
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/real-estate/");
		
		clickOnn(driver, driver.findElement(By.xpath("//a[@id='btnleft']")), 30);
	
		
		
		
		
	}
		public static void clickOnn(WebDriver driver, WebElement locator, int timeout) {
			new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
			locator.click();
			
			
		}
		
	

}
