package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://jqueryui.com/droppable/");
		// so in this url there is frame so basicallly first we have tto switch from page to frame
		
		driver.switchTo().frame(0);
		// now contorl is avaialbe and you can do drag and drop
		
		 WebElement sourceElement = driver.findElement(By.id("draggable"));
		 WebElement targetElement = driver.findElement(By.id("droppable"));
		 
		 // now we can perform drag and drop by the help of the Actions class so lets now create the object of it first
		 
		 Actions action = new Actions(driver);
		 
		 action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		 
		 
		 
		
	}

}
