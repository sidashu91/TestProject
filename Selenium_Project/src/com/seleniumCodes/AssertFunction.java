package com.seleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFunction {
	
	
	@Test
	void test() 
	{
		String url= "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.setProperty("webdriver.chrome.driver", "E:\\Java Workspace\\Drivers_Browsers\\ChromeDriver _76.0.3809.126\\chromedriver.exe");	
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get(url);
	    driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
       String actual = driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getAttribute("innerHTML");
       System.out.println(actual);  
      
       Assert.assertTrue(actual.contains("Enter an email or phone number"));
       System.out.println("Test Completed");
       driver.close();
       driver.quit();
	}

	public static void main(String[] args) {
		
		String url= "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.setProperty("webdriver.chrome.driver", "E:\\Java Workspace\\Drivers_Browsers\\ChromeDriver _76.0.3809.126\\chromedriver.exe");	
	    ChromeDriver driver = new ChromeDriver();
	    
	    
	    driver.get(url);
	    driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
       String Actual = driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText();
       System.out.println(Actual);  
       String Expected = "Enter an email or phone number";
       
       Assert.assertEquals(Actual, Expected);
       
       System.out.println("Test Completed");
       
       driver.close();
       driver.quit();
	}

}
