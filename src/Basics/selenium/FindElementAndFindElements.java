package Basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElementAndFindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://tek-school.com/retail");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://tek-school.com/retail");

//		WebElement destops = driver.findElement(By.xpath("//a[text()='Desktops']"));

		WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
		desktops.click();
		// so now i want to find all link in the film and then i will click only on the
		// text that contains desktops we can do this by xpath or just find the list and
		// click on it

		// difference between driver.findElement and driver.findElements
		// find element
		// finds one element in UI
		// return type is webelement
		// Exception: no SuchElementFoundException

//		
//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

//		allLinks.size(); // how many links are present in this page
		System.out.println(allLinks.size());
		
		for (int i = 0; i < allLinks.size(); i++) {
		String textOfElements=	allLinks.get(i).getText();
		System.out.println(textOfElements);
		
		
		if (textOfElements.equals("Desktops")) {
			allLinks.get(i).click();
			break;
			
		}
		}
		
		// fineELEMENTS
		// finds many elements with same locator address or xpath or tag
		// return type is Arraylist
		// if no element is found will return an empty arraylist and does not throws
		// exception
		
		
		
		// lets take a screenshot of page we opened
		//since the method is static ther eis no need to create object of class iwill just write the class name and call that method
		String outputPath ="C:\\Users\\Raheda Hakim\\Documents\\JavaTraining\\SeleniumProject.Feb2020\\output\\";

		ScreenShotUtility.screenShot(driver, "outputPath", "TestEnvpic");
		
		
		
		
	}

}
