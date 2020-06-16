package Switch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchpractice {

	public static void main(String[] args) {

		// in switch we use iterator to show the child page title
		// we can switch from one window to child window by using the window id
		// some web application have multiple windows and seleneium give them unique alphanumeric id for each window
		// this method is calling widnow handle and each window have unique id and we can switch from one window to another by using id
		// in swtich window we have to use iterator becuase storing objects are not on basis of indexes
		
		
		
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		Set<String> handler =driver.getWindowHandles();
		
		Iterator<String> it =handler.iterator();
		
	String parentWindowId=	it.next();
		System.out.println("parent window id " + parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child window id " + childWindowId);
		
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}

}
