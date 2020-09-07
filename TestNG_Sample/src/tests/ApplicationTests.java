package tests;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTests 
{	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("----------------before test----------------");
	}
		
	@AfterTest
	public void aftertest()
	{
		System.out.println("----------------after test----------------");
	}
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("----------------before method----------------");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("----------------after method----------------");
	}
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("----------------before suit----------------");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("----------------after suit----------------");
	}
	
	//Test Annotations	
			
	@Test(priority=1)  //Annotation for Test Case	
	public void OpenBrowser()
	{
		System.out.println("Browser Open");
		throw new SkipException("Error in opening the browser");
		
	}
	
	@Test(priority=2 , dependsOnMethods={"OpenBrowser"})  //Annotation for Test Case	
	public void OpenURL()
	{
		System.out.println("URL Launched");
	}
	
	@Test(priority=3,dependsOnMethods={"OpenURL"}) //Annotation for Test Case	
	public void Login()
	{
		System.out.println("Logged in to Application");
	}
	
	@Test(priority=4, dependsOnMethods={"Login"})  //Annotation for Test Case	
	public void Logout()
	{
		System.out.println("Logged out of Application");
	}	

}
