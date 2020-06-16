package ActionsClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[1]/a")).click();
		
		
		//all this called mousemovement
		
	}

}
