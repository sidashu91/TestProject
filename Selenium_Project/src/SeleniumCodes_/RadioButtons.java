package SeleniumCodes_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args) 
	{
		System.setProperty( "webdriver.chrome.driver","E:\\Java Workspace\\Drivers for Browsers\\ChromeDriver _76.0.3809.126\\chromedriver.exe");  
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		List<WebElement> rdbtn = driver.findElements(By.xpath("//input[@name='exp']"));
		
		System.out.println(rdbtn.size());		
		
		for(int i=0; i < rdbtn.size();i++)
		{
			String intval = rdbtn.get(i).getAttribute("value");			
			System.out.println(intval);
			
			if(intval.equalsIgnoreCase("30"))
			{
				rdbtn.get(i).click();
			}
			else
			{
				System.out.println("No Value Found");
			}		
		}
	}

}
