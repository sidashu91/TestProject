package com.seleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait1 {

	public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=explicit+wait");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
        
		/*An implementation of the Wait interface that may have its timeout and polling intervalconfigured on the fly. 
		Each FluentWait instance defines the maximum amount of time to wait for a condition, as well asthe frequency 
		with which to check the condition. Furthermore, 
		the user may configure the wait toignore specific types of exceptions whilst waiting, 
		such as NoSuchElementExceptions when searching for anelement on the page. 

		Sample usage: 
		   // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.*/
		
		
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(50, TimeUnit.MILLISECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) 
		     {
		    	WebElement ele= driver.findElement(By.xpath("//*[@id='demo']"));
		    	String value= ele.getAttribute("innerHTML");
		    	if (value.equalsIgnoreCase("WebDriver")) 
		    	{
		    		
					return ele;
				}
		    	else 
		    	{
					System.out.println("The Value displayed is : "+value);
					return null;
				}
		    	
		       //return driver.findElement(By.xpath("//*[@id='demo']"));
		     }
		   });
		   
		   System.out.println(element.getText()+"  is Displayed ---> "+element.isDisplayed());
		  driver.close(); 
		  driver.quit();
		  
		
	}

}
