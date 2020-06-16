package Basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatPopUp {

	public static void main(String[] args) {

		
		// for example you go to the crm website you enter the username and password but you cannot click on signin just because of a chat pop up in the corner of the page
		//so how to handle chat popup in the webpage
		// those wil not be the windows pop up or javascript to handle it with the swicth no we cannot handle it with switch but we can do by mouse handover and by just clicking the x bottun to close
		// so how to perform that? these are called border pop up 
		// these pop up will be available under the iframe of that page so first we use the xpath of that frame and swithct to that then we will perform to close the border popup
		// to mouseouver we have to use the Actions class 
		// so whenever we got that popup frame we have to use the mouseover that is that simple to remember 
		
		
		// how to handle authentication pop up ?
		// for example by the time you open an url the page popups to enter your username and password
		//so how to handle it ? // for this you cannot inspect
		// it means for this you have to enter your username and password then click on sign in button to continue but you cannot inspect
		// so in that case or situation we have to pass the url along with the username and pasword and click on sign in button to get successfull over it 
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//for the user name and password just pass the admin and admin and click on sign in to continue 
		// so in automation you have to pass it like the below 
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		// the syntax is "http://username:password@test.com"
		
		
		String pageMessage = driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(pageMessage);
		
	}

}
