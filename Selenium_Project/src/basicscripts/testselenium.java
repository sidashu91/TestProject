package basicscripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class testselenium {

	public static void main(String[] args) 
	{
			
		System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
