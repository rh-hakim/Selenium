package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_part2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day); // inside the paranthesis we have to pass one elemenet on which we want to
											// perform the action
		select.selectByIndex(10);

		System.out.println(select.isMultiple());// it will return false as day is single option not multiple selection

		// another method is getallOpitons which is really important as well

		List<WebElement> listDays = select.getOptions();
		System.out.println(listDays.size());

		int TotalDays = listDays.size() - 1;
		System.out.println("total days are :" + TotalDays);

		// second question is how to print all values in here ?
		// so whenever there is a list we have to use the forloop

		for (int i = 0; i < listDays.size(); i++) {
			String dayVal = listDays.get(i).getText();
			System.out.println(dayVal);
			if (dayVal.equals("15")) { // so in here my target is 15 if dayVal is equal to 15 the condition is
										// satisfied and i will get out of the loop
				listDays.get(i).click();
				break;

			}

			// so the same we can do and applied for month and year as well so lets do it

// now the third question is how do you use the specified value from a drop down? we will use if statment as naveen used in the above forloop so lets copy that

		}

	}

}
