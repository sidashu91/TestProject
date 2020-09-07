package TestNGPACK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_SetupAndTearDownAndgroups {
  /*
 Pre- conditions: ------------------
@BeforeSuite 
@BeforeClass  
@BeforeTest  
@BeforeMethod  
@Test    

Post Conditions :--------------------
@AfterMethod 
 @AfterTest
 @AfterClass 
 @AfterSuite

   */
	WebDriver driver = null;
    
	//1 4 7
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
    
	//2
	@Test(priority=0)
	public void test1() { 	
		driver.get("https://www.google.com/");
	}
	
	//5
	@Test(priority=1, groups="Siddharth")
	public void test2() {
		driver.get("https://www.youtube.com/");
	}
	
	//8
	@Test(priority=2, groups="Australia")
	public void test3() {
      driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=3, groups="Siddharth")
	public void test4() {
      driver.get("https://www.facebook.com/");
	}
	
	// 3 6 9
	@AfterMethod
	public void tearDown() {
     driver.quit();
	}

}
