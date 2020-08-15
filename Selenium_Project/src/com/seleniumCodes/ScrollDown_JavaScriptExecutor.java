package com.seleniumCodes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class ScrollDown_JavaScriptExecutor
{
	
@Test

void test() 
{
	System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
  	JavascriptExecutor js=   (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");//Scroll vertically down by 1000 pixels	
	
}

}






	
		
		
		
