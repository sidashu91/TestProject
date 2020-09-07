package redifftestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class checkboxtest  extends LoginTest
{
	@Test
	(priority=2,dependsOnMethods= {"LaunchURL"})
	public void CheckboxTest()
	{
		applog.debug("Starting the Test --> Checkbox Test on page");
		
		String chkstatus = driver.findElement(By.xpath("//*[@id='remember']")).getAttribute("checked");
		
		System.out.println(chkstatus);
		
		if(chkstatus.equals("true"))
		{
			applog.debug("PASSED: Checkbox is by default checked ");
		}
		else
		{
			applog.debug("FAILED: Checkbox is un-checked ");
			Assert.assertEquals(chkstatus, "true", "Error Occured - Checkbox is unchecked");
		}
		
		applog.debug("Ending the Test --> Checkbox Test on page");
				
	}

}
