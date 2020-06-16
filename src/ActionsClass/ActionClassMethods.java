package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		String baseURL = "http://tek-school.com/retail";
		driver.get(baseURL);
		
		// what is difference between local variable and global variable?
		
		// create obj of the actions class
		
		Actions action = new Actions(driver);
		
		// create webelement using xpath for componant element on UI
		// using moveElement action method mover your mouse to that element
		// double click on componant element
		// right click on componant element
		/// move to bottom of the page to terms and conditions link 
		// double click on terms and condiitons link
		
		WebElement component = driver.findElement(By.xpath("//a[contains(text(),'Components') and @class='dropdown-toggle']"));
		action.moveToElement(component).build().perform();
		Thread.sleep(4000);
		action.doubleClick(component).build().perform();
		Thread.sleep(5000);
		action.contextClick().build().perform();
		
//	now move to bottomw of page 
		
		WebElement termCondition = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
		action.moveToElement(termCondition).build().perform();
		action.contextClick(termCondition).build().perform();

		
	driver.close();
	
		
		
		
	
		
		
	
	}

}
