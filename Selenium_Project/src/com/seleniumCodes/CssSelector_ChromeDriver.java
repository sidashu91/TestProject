package com.seleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_ChromeDriver {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window();
		 
		System.out.println("The Title is : "+driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\'txtPassword\']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
		
		//*************CSS Selector :
		//   . is for class
		//   * is for contains
		//^ is for Starts with
		//# is the shortcut for id
		driver.findElement(By.cssSelector("div#tableWrapper table[class='table hover'] tr[class='odd'] td[class='left'] a[href*='aveSystemUser?userId=1']")).click();
		Thread.sleep(5000);
		
		
		//Navigate in Selenium :			
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh();
	
		//Selenium CLOSE and Quit :
		//driver.close();
		driver.quit(); // closes all the browsers opened by the driver and destroys the objects created
		
	}
	
	

}
