package com.sampleddf.core.ddf.mystocks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sampleddf.core.ddf.basecases.BaseTestcase;
import com.sampleddf.core.ddf.common.DataUtil;
import com.sampleddf.core.ddf.common.Xls_Reader;

public class AddMFSIP extends BaseTestcase
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
	
	@Test(priority=1,dataProvider="MFAddData")
	public void AddMFSIPTrans(String MFName,String MFAmount,String MFDate)
	{
		//Add MF
		driver.findElement(By.xpath(OR.getProperty("xpath_MFButtonADD"))).click();
		
		//Entering the TestData
		driver.findElement(By.xpath(OR.getProperty("xpath_MFName"))).sendKeys(MFName);
		wait(3);
		driver.findElement(By.xpath(OR.getProperty("xpath_MFName"))).sendKeys(Keys.ENTER);
		wait(2);
		driver.findElement(By.xpath(OR.getProperty("xpath_MFAmount"))).sendKeys(MFAmount);
		driver.findElement(By.xpath(OR.getProperty("xpath_MFDate"))).sendKeys(MFDate);
		wait(2);
		driver.findElement(By.xpath(OR.getProperty("xpath_MFPrice"))).click();
		
		wait(2);
		//selecting checkbox and add the SIP
		//driver.findElement(By.xpath(OR.getProperty("xpath_MFAddSIP"))).click();
		driver.findElement(By.xpath(OR.getProperty("xpath_MFAddButton"))).click();
		
		wait(3);
			
	}
	
		
	@DataProvider
	public Object[][] MFAddData()
	{			
		xls = new Xls_Reader(System.getProperty("user.dir")+"\\TestData\\Data.xlsx");
		return DataUtil.getTestData(xls, "AddMFSIP");		
	}

}
