package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAFile {

	public static void main(String[] args) {

	
		// in order to upload a file using selenium we use sendKeys
		

		
		
		System.setProperty("webdriver.chrome.driver", "c://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://xndev.com/display-image/");
		// whatever we do in selenium one thing is similar all time to find the webElement all the time to perform any action in selenium
		
		// first we need to find locator of WebElement 
		// we have to know the extension what it is like i see the test the extension is .text and picture is .img or png
		// after the filepath we will provide the name and the type of the document we uploaded
		
		WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		
		String filePath = "C:\\Users\\Raheda Hakim\\Downloads\\download.jpg";
		
		uploadFile.sendKeys(filePath);
		
	// for uploading never click on browse just send the keys and send the location of files it will get uploaded
		
		
	}

}
