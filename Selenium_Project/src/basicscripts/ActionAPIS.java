package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionAPIS {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//lib//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.americangolf.co.uk/");		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());	
		
		Actions act = new Actions(driver);
		
		WebElement GC = driver.findElement(By.xpath("//div[@class='header-navigation-left']/ul/li[2]"));
		act.moveToElement(GC).build().perform();
		
		//explicit wait
		WebDriverWait wt = new WebDriverWait(driver,3);
		
		WebElement gcmousearea = driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[2]/ul/li[2]/a"));
		//wt.until(ExpectedConditions.visibilityOf(gcmousearea));
		wt.until(ExpectedConditions.elementToBeClickable(gcmousearea));
		
		
		driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[2]/ul/li[2]/a")).click();
		
		
		
				
	}

}
