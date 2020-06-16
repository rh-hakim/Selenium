package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basics.selenium.ScreenShotUtility;

public class Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		WebElement username = driver.findElement(By.id("u_0_m"));
		username.sendKeys("raheda");
		WebElement lastname = driver.findElement(By.id("u_0_o"));
		lastname.sendKeys("hakim");
		WebElement mobileNumber = driver.findElement(By.id("u_0_r"));
		mobileNumber.sendKeys("9162601145");
		WebElement newPassword = driver.findElement(By.id("u_0_w"));
		newPassword.sendKeys("finditout");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		
		Select select = new Select(month);
		select.selectByVisibleText("Jan");
		Select select1 = new Select(day);
		select1.selectByVisibleText("20");
		Select select2 = new Select(year);
		select2.selectByVisibleText("1995");
		
		
		WebElement gender =driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		gender.click();
		
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"u_0_13\"]"));
		signup.click();
		
		
		String outputPath = ("C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\");
		
		ScreenShotUtility.screenShot(driver, outputPath, "facebook");
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
