package basicscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("uname1");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.accept();
		
		

	}

}
