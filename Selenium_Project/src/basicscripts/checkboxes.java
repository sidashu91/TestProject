package basicscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		List<WebElement> cbbox = driver.findElements(By.xpath("//input[@name='tool']"));
		
		System.out.println(cbbox.size());		
		Thread.sleep(4000);
		
		for(int i=0; i < cbbox.size();i++)
		{
			String intval = cbbox.get(i).getAttribute("value");			
			System.out.println(intval);
			
			Thread.sleep(3000);
			cbbox.get(i).click();
			
			System.out.println("---------------------------");
					
		}

		
	}

}
