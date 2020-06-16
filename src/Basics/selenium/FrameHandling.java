package Basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://djmaza.com");
		
		// whenever you got and exception of unable to locate the element there might be two perceptions as one is the xpath is maybe locked or the element is located in frame 
		// so the better way is to right click on page and if you see the option of frame it means there is frame and you need to switch to that frame to get control over it and do some performance
		
		// we can identify the frame on the basis of indexes, name and by id
		
		
		driver.switchTo().frame(0);
		// we can switcht to frames by indexes or also by frame names as leftpanel or main panel 
		// also we can find the size of frame on the page by the method of size().
		
		//http://www.londonfreelance.org/courses/frames/index.html this link for practice
//		int size= driver.findElement(By.tagName("iframe")).getSize();
		
		
		
		
	}

}
