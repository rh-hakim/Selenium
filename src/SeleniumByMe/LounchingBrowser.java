package SeleniumByMe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchingBrowser {



	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "c:\\ChromeDriver.exe");
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	
	
	
	
		
		
	}

}
