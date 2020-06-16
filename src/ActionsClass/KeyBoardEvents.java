package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.selenium.ScreenShotUtility;

public class KeyBoardEvents {

	public static void main(String[] args) {

		// sendKeys, which is an active element will accept the keys and returns self
		// reference
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		Actions act = new Actions(driver);

		driver.findElement(By.name("firstname")).sendKeys("rahida");
		act.sendKeys(Keys.TAB).sendKeys("hakim").sendKeys(Keys.TAB).sendKeys("raheda@gmail.com").sendKeys(Keys.TAB)
				.sendKeys("926564").sendKeys(Keys.TAB).sendKeys("findit").sendKeys(Keys.TAB).sendKeys("Jun")
				.sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB).sendKeys("1990").sendKeys(Keys.TAB).build().perform();

		driver.findElement(By.xpath("//label[@class='_58mt' and @for='u_0_6']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		String outputPath = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject.Feb2020\\output";
		
		ScreenShotUtility.screenShot(driver, outputPath, "KeyBoardEvents");
		
	

	}

}

