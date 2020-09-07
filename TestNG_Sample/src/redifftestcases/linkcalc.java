package redifftestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class linkcalc extends LoginTest
{
	@Test(priority=2,dependsOnMethods= {"LaunchURL"})
	public void LinkCalc()
	{		
		applog.debug("Starting the Test --> Link on page calc");
		
		try
		{
			int linkcnt = driver.findElements(By.xpath("//a")).size();
			System.out.println(linkcnt);
			if(linkcnt >= 1)
			{
				applog.debug("PASSED: Total Links Present on page--> "+linkcnt);				
				List<WebElement> linksonpage = driver.findElements(By.xpath("//a"));
				
				for(int cntlink = 0; cntlink <linkcnt;cntlink++)
				{
					linksonpage.get(cntlink);
					System.out.println(linksonpage.get(cntlink).isDisplayed());
					System.out.println(linksonpage.get(cntlink).getText());				
				}			
			}
			else
			{
				applog.debug("FAILED: No Links Present on page");
				Assert.assertTrue(linkcnt<1, "No Links Present on page");				
			}	
		}
		catch(Exception e)
		{
			applog.error("Run time Exception Caused", e);
		}		
		
		applog.debug("Ending the Test --> Link on page calc");
	}
}
