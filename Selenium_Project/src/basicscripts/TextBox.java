package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@qa='signUpLink' and @class='ng-scope']")).click();
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Tejas");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("ABCD");
		
		//email - By.Name
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		
		//pass -By.Id
		driver.findElement(By.id("pwd")).sendKeys("abcd@1234");
					
		//ref code - By.classname
		driver.findElement(By.className("referral")).sendKeys("OCT2019");
		
		//button -Xpath
		driver.findElement(By.xpath("//button[@class='btn btn-default signup-btn']")).click();
		driver.findElement(By.cssSelector("#signup > div > signup > div > form > button")).click();
		
		//driver.close();		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
