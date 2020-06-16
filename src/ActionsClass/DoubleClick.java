package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Basics.selenium.ScreenShotUtility;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://api.jquery.com/dblclick/");

		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		// as we have iframe in this we have to first swithch to iframe and get the contorl on iframe then we can continuer our rest of the work of execution
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		
		action.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body//div"))).build().perform();
		
		
		//by the time it double click the colour should change from blue to yellow
		
		String outputPath = "C:C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath, "doubleclickyellow");
	}

}
