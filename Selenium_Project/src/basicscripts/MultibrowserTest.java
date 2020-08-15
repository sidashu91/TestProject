package basicscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultibrowserTest {

	public static void main(String[] args) throws IOException 
	{		
		Properties prop = new Properties();		
		FileInputStream fs = new FileInputStream("F:\\My Work\\TECH DATA\\seleniumproject\\seleniumbasic2\\src\\multi.properties");
		
		prop.load(fs);
		
		String browser= prop.getProperty("browser");
		System.out.println(browser);		
		String APPURL= prop.getProperty("URL");
		System.out.println(APPURL);		
		WebDriver driver = null;		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
			driver = new FirefoxDriver();					
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();					
		}
		else
		{
			System.out.println("Browser Not Found");
		}
		
		driver.get(APPURL);
		
		
		
	}

}
