package basicscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit wait appllied
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://economictimes.indiatimes.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		//capture the size list
		System.out.println(alllink.size());
		
		for(int i=0; i <alllink.size();i++)
		{
			if(alllink.get(i).isDisplayed() == true)
			{
				System.out.println("-----------------------------");
				System.out.println(alllink.get(i).isDisplayed());
				System.out.println(alllink.get(i).getText());
				System.out.println("-----------------------------");
			}

	}
	}
}
