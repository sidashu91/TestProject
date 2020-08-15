package basicscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatelinks {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://economictimes.indiatimes.com/");
		driver.navigate().to("https://edition.cnn.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//ul[@data-vr-zone='home-top-col3']/li[2]/article/div/div/h3/a")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().refresh();
		
	}

}
