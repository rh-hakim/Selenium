package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_part4 {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		String month_xpath = "//select[@id='month']//option";
		String year_xpath = "//select[@id='year']//option";
		String day_xpath = "//select[@id='day']//option";
		selectDropDownValues(month_xpath, "Feb");
		selectDropDownValues(year_xpath, "1995");
		selectDropDownValues(day_xpath, "18");
		

	}

	public static void selectDropDownValues(String xpathValue, String value) {
		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']//option")); // so this is the generic method
		
		// so this is the
																									// customize xpath
																									// and option in
																									// this xpath is the
																									// child of select
		System.out.println(monthList.size());

		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
			if (monthList.get(i).getText().equals("value")) {
				monthList.get(i).click();
				break;

			}
		}
	}
}
