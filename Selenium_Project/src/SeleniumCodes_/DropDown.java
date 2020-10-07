package SeleniumCodes_;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
	
	
	
	public static void main(String[] args) 
		
			
	
	{
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\ChromeDriverV76\\chromedriver.exe");

		WebDriver chromeDriver = new ChromeDriver();		
		chromeDriver.get("https://www.facebook.com/");
		chromeDriver.manage().window().maximize();
		System.out.println(chromeDriver.getTitle());
			
		Select months = new Select(chromeDriver.findElement(By.xpath("//*[@id='month']")));
		 List<WebElement> listOfMonths= months.getOptions();
		 
//		 System.out.println(listOfMonths);
		  
		 String nameOfMonth;
		 for (int i = 0; i <listOfMonths.size(); i++) 
		 {
			 nameOfMonth=listOfMonths.get(i).getText();
			 
			System.out.println("At index"+"("+i+")"+" ="+nameOfMonth);
			
			  if (nameOfMonth.equals("Dec")) {

				listOfMonths.get(i).click();
				
			}
		 }
		 
		 
		 
		  
		
		
		
	}
	
	

}
