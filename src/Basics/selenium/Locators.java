package Basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		// we have locators by id is the fastest locator usaullay id is unique 
		
		// by.name
		// by.classname
		//by.cssselector is also faster
		//by.xpath slow but you can travel back and from parent to child and child to parent and siblings 
		//by.linkText
		// syntax for locators are 
		// ("//*[@id=\"login_form\"]/div[3]/div[2]/button")
		// WebElement loginButton = driver.findElement(By.xpath();
		// WebElement loginButton = driver.findElement(By.name();
		// WebElement loginButton = driver.findElement(By.classname();
		// WebElement loginButton = driver.findElement(By.cssSelector();
		// WebElement loginButton = driver.findElement(By.id();
		// WebElement loginButton = driver.findElement(By.LinkText();
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// by id
		
//		WebElement username = driver.findElement(By.id("email"));
//		// by name
//		WebElement username = driver.findElement(By.name("email"));
//		//by classname
//		
//		WebElement username = driver.findElement(By.className("inputtext login_form_input_box"));

		// syntax for xpath
		// //[@attribute = 'value'] (you can write any xpath with this syntax)
		// two type of expath first one is Absolute xpath, 2. the second one is relative xpath
		// diffrence betwween both of them, absolute xpath start with single slash (/), starts with head of the html node and goes all the way to element location
		// absolute xpath is not reccommended for automation
		// but relative xpath starts with (//) double slash, starts mainly from element tag, 95% used in automation - UI automation
		
		
		

		//xpath by relative xpath
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		// by CSS selector the syntax is below
		// tag[attribute=value] mainly for id, name and class as well
//		WebElement username = driver.findElement(By.cssSelector("input[name='email']"));
	}

}
