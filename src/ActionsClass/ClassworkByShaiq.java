package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Basics.selenium.ScreenShotUtility;

public class ClassworkByShaiq {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail");
		
//		
//	WebElement loptopandNotebook = driver.findElement(By.xpath(""));
//	loptopandNotebook.click();
	
	Actions action = new Actions(driver);
	
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Laptops & Notebooks' and @class ='dropdown-toggle']"))).build().perform();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks' and @class ='see-all']")).click();

	WebElement sort= driver.findElement(By.xpath("//select[@id='input-sort']"));
	Select sortby;
	
	sortby= new Select(sort);
	sortby.selectByVisibleText("//label[@class='input-group-addon' and @for='input-sort']");
	
	WebElement sorting = driver.findElement(By.xpath("//select[@id='input-limit']"));
	
	Select sortby1;
	sortby1 = new Select(sorting);
	
	sortby1.selectByVisibleText("100");
	
	

		
	String outputPath ="C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";

	ScreenShotUtility.screenShot(driver, outputPath, "TekSchool");
	}

}

