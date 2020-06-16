package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_part3 {

	public static void main(String[] args) {

		// now i dont want to select the select class so how you will select the value from dropdownm without the select class so here we go:
		// we have to use driver.findelements 
		
		
		
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		List<WebElement> yearList = driver.findElements(By.xpath("//select[@id='year']//option"));// so this is the customize xpath  and option in this xpath is the child of select
		System.out.println(yearList.size());
		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']//option"));// so this is the customize xpath  and option in this xpath is the child of select
		System.out.println(monthList.size());
		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']//option"));// so this is the customize xpath  and option in this xpath is the child of select
		System.out.println(dayList.size());
		
		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
			if(monthList.get(i).getText().equals("jun")) {
				monthList.get(i).click();
				break;
				
			}
			
		}
		

		
		
	}

}
