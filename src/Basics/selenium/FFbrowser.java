package Basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFbrowser {

	public static void main(String[] args) {

		// we dont need the setproperty because it is default browser for selenium
		// but in case if we use the geckodriver we will need to use the setproperty method to run the browser
		
		
		System.setProperty("webdriver.geckodriver.driver", "c:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		// now we gonna open the Environemt website
		driver.get("http://tek-school.com/retail");
		
	// stores the website title in a string and string name is title. method to get website is .gettitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		// closes the browser
		driver.quit();
		
		
		
		
	}

}
