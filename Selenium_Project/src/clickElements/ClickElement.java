package clickElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {
	
	public static void click(WebDriver localDriver, String LocalId) 
	{
		
		Actions act =  (Actions) localDriver ;
		act.moveToElement(localDriver.findElement(By.id(LocalId))).click().build().perform();
		
		
		
	}

}
