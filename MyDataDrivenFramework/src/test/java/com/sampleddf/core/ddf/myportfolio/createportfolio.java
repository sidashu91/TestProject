package com.sampleddf.core.ddf.myportfolio;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.sampleddf.core.ddf.basecases.BaseTestcase;
import com.sampleddf.core.ddf.common.DataUtil;
import com.sampleddf.core.ddf.common.Xls_Reader;

public class createportfolio extends BaseTestcase
{
	Xls_Reader xls = null;

	@BeforeTest()
	public void BrowserTest() throws IOException, InterruptedException
	{
		System.out.println("In Before Test AddStocks");		
		LaunchBrowser();
		LaunchURL();
		LoginAUT();
		waitForPageToLoad();
	}	
	
	@AfterTest()
	public void QuitBrowser() throws InterruptedException 
	{
		System.out.println("In After Test AddStocks");
		wait(3);
		LogoutAUT();
		CloseBrowser();	
	}
	
	@Test(priority=1,dataProvider="CreatePort")
	public void createpos(String PortName)
	{
		try
		{
			
		logger = objreports.createTest("My Porfolio");	
		logger.log(Status.INFO, "My Porfolio - Create Positive Test Starts");
		takeScreenShot();
		logger.log(Status.INFO, "Create Portfolio");
		driver.findElement(By.xpath(OR.getProperty("xpath_createbutton"))).click();
		driver.findElement(By.xpath(OR.getProperty("xpath_portName"))).clear();
		takeScreenShot();
		driver.findElement(By.xpath(OR.getProperty("xpath_portName"))).sendKeys(PortName);
		takeScreenShot();
		driver.findElement(By.xpath(OR.getProperty("xpath_portcreate"))).click();
		takeScreenShot();
		logger.log(Status.PASS, "Created Portfolio with Name:  "+PortName);
					
		WebElement ddlist = driver.findElement(By.xpath("//select[@id='portfolioid']"));		
		Select sl = new Select(ddlist);		
		List<WebElement> portname = sl.getOptions();
		
		for(int i=0;i<portname.size();i++)
		{
			String Verifyportname = portname.get(i).getText();
						
			if(Verifyportname.equalsIgnoreCase(PortName))
			{
				logger.log(Status.PASS, "Enter Name is appearing inside the Dropdown: "+Verifyportname);
				takeScreenShot();
			}			
		}
		}
		catch(Exception e)
		{
			logger.log(Status.ERROR, "Exception Occured"+e);
			takeScreenShot();

		}
	}
	
	@DataProvider
	public Object[][] CreatePort()
	{			
		xls = new Xls_Reader(System.getProperty("user.dir")+"\\TestData\\Data.xlsx");
		return DataUtil.getTestData(xls, "CreatePortfolio");		
	}
	
	

}
