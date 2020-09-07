package ListernersDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListernersDemo.TestNgListeners.class)
public class TestListeners 
{

	@Test
	public void GoogleTitleTest()  
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Geko\\geckodriver.exe");
		 WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
		//driver.quit();
	}
	
}
