package seleniumCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Geko\\geckodriver.exe");   //OR:
		
		System.setProperty( "webdriver.gecko.driver",System.getProperty("user.dir")+"//lib//geckodriver.exe");
		WebDriver fireFoxDriver = new FirefoxDriver();
		
		   
		fireFoxDriver.get("google.com");
		fireFoxDriver.manage().window().maximize();
		   
		fireFoxDriver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");;
		fireFoxDriver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		fireFoxDriver.close();
		
	}

}
