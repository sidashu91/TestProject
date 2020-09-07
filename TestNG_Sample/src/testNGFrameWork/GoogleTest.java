package testNGFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	}
	
	
	@Test(priority=2, groups= "Image")
	public void imageTest() 
	{
	boolean b =	driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
	}
	
	
	@Test(priority=3, groups="Tes")
	public void mailLinkTest() 
	{
	boolean b= 	driver.findElement(By.linkText("mail")).isDisplayed();
		
	}
	
	@Test(priority=4 , groups="Test")
	public void test1() 
	{
	System.out.println("test case 4");
		
	}
	
  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
  }
}
