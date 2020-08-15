package com.seleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapPopupModal {
	
@Test
void test(){
		
System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.goibibo.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='get_sign_up']")).click();

driver.switchTo().frame("authiframe");
driver.findElement(By.xpath("//*[@id='authMobile']")).sendKeys("9770136077");;
driver.close();
driver.quit();
		
	}
	

}
