package parameterTest_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	   @Test
	   @Parameters({"browser","env","url","emailId"})
       public void yahooLogintest (String browser, String env, String url, String emailId) {
		if (browser.equals("chrome")) 
		{
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) 
		{
			System.setProperty( "webdriver.gecko.driver",System.getProperty("user.dir")+"//lib//geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		
	}
	
}
