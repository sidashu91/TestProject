package SeleniumCodes_;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		
		WebElement ele_to_MouseHover= driver.findElement(By.xpath("//button[text()='Automation Tools']"));
	  
		
		Actions act =new Actions(driver) ;
	    act.moveToElement(ele_to_MouseHover);
		
	    List<WebElement> href1 = driver.findElements(By.xpath("//*[@class='dropdown-content']//a"));	
		
	    ListIterator<WebElement> i  = href1.listIterator();
	    while (i.hasNext()) {
		 WebElement element =i.next();
		String strName= element.getAttribute("innerHTML");
		 
		System.out.println(strName);
		
		
		if(strName.equalsIgnoreCase("Selenium")) 
		{
			element.click();
			break;
		}
			
		}
		
		

	}

}
