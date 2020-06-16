package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByShaiq {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		WebElement header = driver.findElement(By.xpath("//frame[@name='main']"));
		

		driver.switchTo().frame(header);
		WebElement headerframe = driver.findElement(By.xpath("//h2[text()='Title bar']"));
	
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		
		WebElement nextframe = driver.findElement(By.xpath("//frame[@name='navbar']"));
		
		driver.switchTo().frame(nextframe);
		
		WebElement homebuttn = driver.findElement(By.xpath("//a[text()='Home' and @target='content']"));
		homebuttn.click();
		
	
		driver.switchTo().defaultContent();
		
	
		WebElement footerframe = driver.findElement(By.xpath("//frame[@name='bot']"));
		driver.switchTo().frame(footerframe);
		
		
		WebElement footer = driver.findElement(By.xpath("/html/body/h2"));
		
		
		
		System.out.println(driver.getTitle());
		
		
		
	
		
		
		
	}

}
