package Select;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.selenium.ScreenShotUtility;

public class SwitchPractice672020 {

	public static void main(String[] args) throws InterruptedException {

		// in selenium project

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// how to handle the window popups?
		// basically we can handle by switch and alerts method
		
		
		driver.get("https://ksrtc.in/oprs-web/");

		

		// so for handling im creating and storing stirn pagetitle
		String pagetitle;
		
		// handle window pop ups (webpage based pop up)
		// switch method and then alert method
		// we can either accept an alert or deny if decline option is available
		// we can print out the alert message too
		
		
		WebElement searchBus = driver.findElement(By.xpath("/button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		searchBus.click();
		// we will get text of aler and store it in a string
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(5000);
		
		pagetitle = driver.getTitle();
		System.out.println("this is before Switching windows" + pagetitle);
		
		WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
		crm.click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();
		String parentWindow = it.next();
		
		String childWindow = it.next();
	
//		
		driver.switchTo().window(childWindow);
		pagetitle=driver.getTitle();
	
		WebElement username = driver.findElement(By.id("//input[@id='UserName']"));
		username.sendKeys("krish@gmail.com");
		
		WebElement password = driver.findElement(By.id("//input[@id='Password']"));
		password.sendKeys("findit");
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Log in']"));
		login.click();
		
		Thread.sleep(5000);
		
		String outputPath ="C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";

		ScreenShotUtility.screenShot(driver, outputPath, "IndianWebsitePRactice");
		driver.close();
		driver.switchTo().window(parentWindow);
		
		
		
		
		
	}

}
