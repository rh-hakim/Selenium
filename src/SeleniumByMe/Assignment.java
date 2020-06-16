package SeleniumByMe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail");
		
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
		WebElement MyAccount = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		MyAccount.click();
		
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("sdet@tekschool.com");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("Welcome1");
		
		
		WebElement Loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		Loginbutton.click();
		
		
		
		
		
		
		
		
	}

}
