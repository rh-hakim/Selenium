package Basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/hotel/");
		System.out.println(driver.getTitle());
		
		String outputPath ="C:\\Users\\Raheda Hakim\\Documents\\JavaTraining\\SeleniumProject.Feb2020\\output\\";

		ScreenShotUtility.screenShot(driver, outputPath, "TestEnvpic");
		
		WebElement signin =driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
		signin.click();
		
		Thread.sleep(5000);
//		String outputPath ="C:\\Users\\Raheda Hakim\\Documents\\JavaTraining\\SeleniumProject.Feb2020\\output\\";

		ScreenShotUtility.screenShot(driver, outputPath, "TestEnvpic2");
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("tekschook@student.org");
		
		WebElement password  = driver.findElement(By.id("passwd"));
		password.sendKeys("findit");
		
		
		WebElement signinbtn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		signinbtn.click();
		
		
//		
//		String outputPath ="C:\\Users\\Raheda Hakim\\Documents\\JavaTraining\\SeleniumProject.Feb2020\\output\\";

		ScreenShotUtility.screenShot(driver, outputPath, "TestEnvpic1");
		
		driver.close();
		driver.quit();
		
	}

}
