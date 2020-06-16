package Basics.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {



	public static void main(String[] args) {

		
		// we gonna write a utilty to in order to rewrite everytime we write one utilty to call it everytime
		
		
		// we write a method with variables but no return type
		
	
		
		
		
	}
	
	/**
	 * 
	 * @param driver
	 * @param location
	 * @param fileName
	 */  
	public static void screenShot(WebDriver driver, String location, String fileName) {
		
		// take screenshot
		// store screenshot in a folder or location
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileUtils.copyFile(file, new File(location + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception in execution");
		}
		
		
		
		
		
	}

}
