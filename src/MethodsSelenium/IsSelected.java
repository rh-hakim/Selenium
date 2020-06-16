package MethodsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {

		// this method used to verify if the web element is selected or not . 
		// isSelected method is pre-dominatly used with radio buttons , dropdowns and checkboxes
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://facebook.com");

		boolean b1=	driver.findElement(By.xpath("//*[@id=\"u_0_z\"]/span[1]/label")).isSelected();
		System.out.println(b1);
		
	}

}
