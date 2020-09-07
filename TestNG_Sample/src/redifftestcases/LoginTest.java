package redifftestcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest
{
	//Initialize/declarations
	
	public WebDriver driver = null;	
	
	Properties prop = new Properties();
	Logger applog = Logger.getLogger("devpinoyLogger");
			
	@BeforeTest()
	public void LaunchBrowser() throws IOException
	{
		applog.debug("Starting the Test --> Launch Browser");
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\config.properties");
		prop.load(fs);
				
		String Browser = prop.getProperty("Browser");
		System.out.println(Browser);
				
		if (Browser.equals("firefox"))
		{
			try
			{
				System.setProperty("webdriver.gecko.driver","F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
				driver = new FirefoxDriver();	
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
			}catch(Exception e)
			{
				applog.error("Browser Launching error", e);
			}		
			
		}
		else if (Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
		}
		else if (Browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}
		else if (Browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\EdgeDriver\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();	
		}
		
		Set<String> winIds = driver.getWindowHandles();
		System.out.println("Total windows - "+ winIds.size());
		
		if(winIds.size()>=1)
		{
			applog.debug("PASSED: Browser Launch Successful...");			
		}
		else
		{
			applog.debug("FAILED: Browser Launch Failed...");
			Assert.assertTrue(winIds.size()<1, "Browser Failed to Launched");
		}		
			
		applog.debug("Ending the Test --> Launch Browser");
	}
	
	@Test(priority=1)
	public void LaunchURL()
	{
		applog.debug("Starting the Test -> URL Launch");
		driver.navigate().to(prop.getProperty("URL"));
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		if(driver.getTitle().equals("Rediffmail"))
		{
			applog.debug("PASSED: URL Launched Successfully");
		}
		else
		{
			applog.debug("FAILED: URL Launched but Not Expected");
			Assert.assertEquals(driver.getTitle(), "Rediffmail", "Error Occured - URL Failed to Launch");
		}	
		
		applog.debug("Ending the Test -> URL Launch");		
	}
	
	@AfterTest()
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
