package Basics.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtility {
	
	
      // below is the explanation of javascriptexecuter?
	
	// JavaScript is an interface that helps to execute javascript through
	// selenium webdriver, javascript executer provides two methods "executescript" and "executeAsyncScript"
	// to run javascript on the selected window or current page
	
	
	// we gonna create static method
	//2 javascript uitilty we use it in order to do some action
	
	
	// scrollpagedown using javascript executer
	
	
	public static void scrollPageDownWithJS(WebDriver driver) {
		
		// the same we gonna create javascript object like select class
		
		 // this is the syntax for javaexecuter
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	
		
	}
	// click on element using javaexecutor
	public static void clickElementWithJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("arguments[0].click()", element);
		
	}
	
	//send keys using java executor
	
	// we use sendKeys with javascriptexecutor if the webelement either have id name or class either only have one of them if the webelement does not have one of them 
	// then we  use the regular method of send keys we cannot use javascriptExecutor then
	public static void sendKeysWithJS(WebDriver driver, String element, String value) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("document.getElementById('"+ element+"').value= '"+value +"'");
	}
	
	// you can click on element by many ways by .click, javascriptexecutor. sendkey, keys.enter, 
	
	// how to you select Calendar with using javascript Executor // we all use the executor for elements just because of their dynamic nature
	// the challenge is to handle the dynamic elements
	public static void selectCalenderDateWithJS(WebDriver driver, String date, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		
		
	}
	
	
	
	
	

}
