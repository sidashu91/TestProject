package com.seleniumCodes;




import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	

public class xPath {
	
	public static void main(String[] args) {
		
		
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");		//System.setProperty( "webdriver.gecko.driver",System.getProperty("user.dir")+"//lib//geckodriver.exe");
		WebDriver chromedvr = new ChromeDriver();
		chromedvr.get("https:///opensource-demo.orangehrmlive.com");
	   
		
		chromedvr.manage().window().maximize();
		   
		chromedvr.findElement(By.xpath("//*[@id=\'txtUsername\']")).sendKeys("Admin");;
		chromedvr.findElement(By.xpath("//*[@id=\'txtPassword\']")).sendKeys("admin123");
		chromedvr.findElement(By.xpath("//*[@id='btnLogin']")).click();
        chromedvr.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
       
       //Tag Name
        List<WebElement> list =   chromedvr.findElements(By.tagName("a"));
        System.out.println(list.size());        
        for (int i = 0; i <list.size(); i++) 
        {
        	//System.out.println(list.get(i).getText());
		
        	if (list.get(i).getText().equals("john.smith")) 
        	{
			list.get(i).click();	
			}
        	
        	
		}
      //-----------------Prints the no of time the tag is there        
//        ListIterator<WebElement> itr = list.listIterator();     
//        while (itr.hasNext()) {
//        	System.out.println(itr.next());
//			
//			
//		}
        
        
        
        
	}

}
