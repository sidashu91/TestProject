package TestNGPACK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertEquas1 {
		WebDriver driver ;
		
		@BeforeMethod
		public void setup () 
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//lib//chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait (5, TimeUnit.SECONDS);
		  	driver.get("http://www.google.com");    
		}
		
		@Test(priority=1, groups="Title")
		public void googletitleTest() 
		{
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google",  "Title is not matched ");
			
		}//3rd parameter if it fails		}
		
		
			
		
		
	  @AfterMethod
	  public void tearDown() 
	  {
		  driver.quit();
	  }
}
