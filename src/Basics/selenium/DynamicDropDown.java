package Basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		// click on this element
		from.click();
		// clear the value
		from.clear();
		Thread.sleep(3000);
		from.sendKeys("wash");
		// list of dynamic dropdows opens
		List<WebElement> departure = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		for (WebElement city : departure) {
			try {
				if (city.getText().trim().contains("WASh"))
					JSUtility.clickElementWithJS(city, driver);
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
		}

		
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		to.click();
		to.clear();
		to.sendKeys("las");
		
		List <WebElement> arrival = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
		
		for(WebElement cityArrival: arrival) {
			
			try {
			if (cityArrival.getText().trim().contains("LAS"))
				JSUtility.clickElementWithJS(cityArrival, driver);
			}catch(StaleElementReferenceException e) {
				e.printStackTrace();
			}
			
		}
		
		Thread.sleep(4000);
		
		// select passanger from static dropdown
		
		WebElement numPass = driver.findElement(By.xpath("//*[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		Select select = new Select(numPass);
		
		// select 9 passanger
		select.selectByVisibleText("9");
		
		Thread.sleep(4000);
		
		WebElement departureDate = driver.findElement(By.xpath("//input[@name='departDate']"));
		WebElement arrivalDate = driver.findElement(By.xpath("//input[@name='returnDate']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
		
		// departure 06/20/2020
		String depDate = "05/20/2020";
		// arrival 07/31/2020
		String retDate = "07/31/2020";
		
		// Select calendar date with JSExecutor for Departure date
		JSUtility.selectCalenderDateWithJS(driver, depDate, departureDate);
		JSUtility.selectCalenderDateWithJS(driver, retDate, arrivalDate);
		
		Thread.sleep(3000);
		
		searchButton.click();
	}
	
	
	
}
