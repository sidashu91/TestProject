package testNGFrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics 
{
	
	/*
Setup property for Chrome
launchBrowser
login
Enter URL
Google Title Test
log out
CLose Browser
Delete all Cookies
	 */
	
	
//PreRequisites annotation/ PreConditions @Before:
	
	@BeforeSuite //Before STCM - Suite test class Method
	public void setUp() {
		System.out.println("Setup property for Chrome");
	}
	
	@BeforeTest
	public void launchBrowser() 
	{
		System.out.println("launchBrowser");
	}
	
	
	@BeforeClass
	public void login() 
	{
		System.out.println("login");
	}
	
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("Enter URL");
	}
	
	

	
	//***********TEst Case
	
	@Test
	public void FirstTest() 
	{
		System.out.println("FirstTestt");
	}
	
	
	@Test
	public void SecondTest() 
	{
		System.out.println("SecondTest");
	}
	
	
	@Test
	public void ThirdTest() 
	{
		System.out.println("ThirdTest");
	}
	// Post Conditions
	
	@AfterMethod     //MCTS - Method Class Test Suite
	public void logOut() 
	{
		System.out.println("log out");
	}
	
	
	@AfterClass
	public void closeBroser() {
		
		System.out.println("CLose Browser");
	}
	
	
	
	@AfterTest
	public void deleteAllCookies() 
	{
		System.out.println("Delete all Cookies");
	}
	
	
	
	
//	@AfterSuite
//	public void geneateTestReport() {
//		System.out.println("Generate test Report");
//	}
	
}
