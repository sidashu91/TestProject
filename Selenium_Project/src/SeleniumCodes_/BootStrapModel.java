package SeleniumCodes_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapModel {
	
	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=bootstrap+model");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-lg']")).click();
		
		
	}

}
