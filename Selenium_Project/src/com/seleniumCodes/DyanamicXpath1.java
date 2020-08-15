package com.seleniumCodes;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicXpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("Selenium");
		
		
		List<WebElement> list=
	driver.findElements(By.xpath("//*[@id='yui_3_18_0_3_1569521127237_664']"));
	System.out.println(list);
		  
	
	list.get(0).click();
	
		
	
	}

	
}
