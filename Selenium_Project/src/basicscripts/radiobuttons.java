package basicscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
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
