package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_part1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");

		// selectbyvisibletext()

		// whatever we choose in selenium will return in string there is no Int or any
		// other type all String point to remmember
		
//
//		Select select = new Select(element);
//
//		select.selectByVisibleText("Jan");
//
//		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
//
//		Select select2 = new Select(element2);
//		select2.deselectByVisibleText("5");
//		// select byindex
//
//		select.selectByIndex(0);

		// The value of an option and the text of the option may not be always same and
		// there can be a possibility that the value is not assigned to Select
		// webelement. If the value is given in the Select tag then only you can use the
		// selectByValue method
		WebElement year= driver.findElement(By.id("year"));
//		Select select1 = new Select(element1);
//	
//		select1.selectByValue("2020");
		
		// so now creating each object everytime is not a good way of coding instead we are creating a method so whenever we want to use we call that method just like we create
		// the screenshot method to call it everytime we want to take screenshto
		String dob = "10-May-2010";
		
		String dobArr[]=dob.split("-"); // we can use the split method as welll
		
		
		selectValueFromDropDown(day, "10");
		selectValueFromDropDown(month, "May");
		selectValueFromDropDown(year, "2010");
		selectValueFromDropDown(day, dobArr[0]);
		selectValueFromDropDown(month, dobArr[1]);
		selectValueFromDropDown(year, dobArr[2]);
	}
	
		
	// basically this method will accept two things only element and i put value as well so now lets go ahead with it 
		public static void selectValueFromDropDown(WebElement element, String value) {
			Select select = new Select (element);
			select.selectByVisibleText(value);
		
		
		

	}


}
