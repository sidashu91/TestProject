package com.seleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserOpening {

	public static void main(String[] args) {
		
		
		System.setProperty( "webdriver.ie.driver",System.getProperty("user.dir")+"//lib//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		   
		driver.findElement(By.xpath("//*[@id=\'txtUsername\']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\'txtPassword\']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();

	}

}
