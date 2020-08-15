package com.seleniumCodes;


import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class BootsStrapDropdown {

	
	
	@Test
	void test()
	{
		
	
	{
		
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\ChromeDriverV76\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//*[@id='dropdownMenuButton']")).click();
		
		List<WebElement> list = new ArrayList<WebElement>();
		
		list=driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]/a"));
		for (int i = 0; i < list.size(); i++) {
			
		String ele =list.get(i).getText();
		String element= list.get(i).getAttribute("innerHTML");
		System.out.println(ele);
		System.out.println(element);	
		if (ele.equals("Action") || element.equals("Action")) {
			
			list.get(i).click();
		}
			
		}
		driver.quit();
		
		
		}
	

		
		
		
		
	}
	}

