package sampleCode;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public void navigatePractice() throws IOException {
		driver.get("https://www.sampleCode.com");
	}
}