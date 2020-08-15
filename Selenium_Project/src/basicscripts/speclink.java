package basicscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class speclink {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://economictimes.indiatimes.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		List<WebElement> speclink = driver.findElements(By.xpath("//li[@data-ga-action='Widget Top News']/ul/li/a"));
		
		for(int i=0; i < speclink.size();i++)
		{
			if(speclink.get(i).isDisplayed() == true)
			{
				System.out.println("-----------------------------");
				System.out.println(speclink.get(i).isDisplayed());
				System.out.println(speclink.get(i).getText());
				System.out.println("-----------------------------");
			}
	}
		

	}

}
