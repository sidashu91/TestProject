package SeleniumCodes_;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakeScreenShot {

	
	
	static WebDriver driver;
    
	 public static void takeScreenShot(String filename) throws IOException 
	 {
	 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(src, new File ("E:\\Java Workspace\\SeleniumPracticeBySid\\Screenshots\\"+filename+".png"));
	 driver.close();
	 }
	 
	 
	 
	public static void main(String[] args) throws IOException 
	{    
		System.setProperty( "webdriver.chrome.driver", "E:\\Java Workspace\\Drivers for Browsers\\ChromeDriver _76.0.3809.126\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		 driver.get("https://en.wikipedia.org/wiki/Knight");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[@href='/wiki/File:Codex_Manesse_Hartmann_von_Aue.jpg'][@class='image']")).click();
		 takeScreenShot("Ayush"); 
		 driver.quit();	
		 	
	}
	
	    
		 
	 
		 
	    
			

	}


