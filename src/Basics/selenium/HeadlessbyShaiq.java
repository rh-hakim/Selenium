package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessbyShaiq {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe" );
//		
//		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://canvas.instructure.com/login/canvas");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	WebElement email=	driver.findElement(By.id("pseudonym_session_unique_id")); // 
	
	WebElement password = driver.findElement(By.id("pseudonym_session_password"));
	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
	
	email.sendKeys("rh.hakim2020@gmail.com");
	password.sendKeys("Confirmpc231.");
	loginButton.click();
	
	System.out.println(driver.getTitle());
	String outputPath = "C:\\Users\\Raheda Hakim\\Documents\\JavaTraining\\SeleniumProject.Feb2020\\output";
	ScreenShotUtility.screenShot(driver, outputPath, "Headless");
	System.out.println("finally execution done!");
	}

}
