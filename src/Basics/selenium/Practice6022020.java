package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice6022020 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/index.php?route=account/register");
		
		boolean b1=	driver.findElement(By.xpath("//input[@name='newsletter' and@value='1']")).isSelected();
		System.out.println(b1);
		
		Thread.sleep(5000);
	
		WebElement yesbutton = driver.findElement(By.xpath("//input[@name='newsletter' and@value='1']"));
		yesbutton.click();
//		
//		Actions action = new Actions(driver);
//		
//		
//		action.sendKeys(driver.findElement(By.xpath("//input[@name='newsletter' and@value='1']"))).build().perform();
		
		boolean b2 = driver.findElement(By.xpath("//input[@name='newsletter' and@value='1']")).isSelected();
		
		System.out.println(b2);
		
		boolean b3 =driver.findElement(By.xpath("//a[text()='Privacy Policy']")).isDisplayed();
		System.out.println(b3);
		
		boolean b4 = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		System.out.println(b4);
		
		
//		driver.findElement(By.name("firstname")).sendKeys("rahida");
//		act.sendKeys(Keys.TAB).sendKeys("hakim").sendKeys(Keys.TAB).sendKeys("raheda@gmail.com").sendKeys(Keys.TAB)
//				.sendKeys("926564").sendKeys(Keys.TAB).sendKeys("findit").sendKeys(Keys.TAB).sendKeys("Jun")
//				.sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB).sendKeys("1990").sendKeys(Keys.TAB).build().perform();
		
	}

}
