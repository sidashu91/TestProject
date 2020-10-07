package SeleniumCodes_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ElementIsNotClickable_Action_moveToElement {
	

	
	

	
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
		
		Actions act =  (Actions) driver ;
		WebElement element= driver.findElement(By.xpath("//input[@id='persistent']"));
		
		act.moveToElement(element).click().build().perform();
		
		
	}

}



