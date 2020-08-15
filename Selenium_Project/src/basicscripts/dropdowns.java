package basicscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement ddlist = driver.findElement(By.xpath("//select[@id='continents']"));
				
		Select sl = new Select(ddlist);
		
		sl.selectByIndex(3);
		
		sl.selectByValue("NA");
		
		sl.selectByVisibleText("Antarctica");
		
		

	}

}
