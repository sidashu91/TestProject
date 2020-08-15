package TestNGPACK;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotetest 
{
	@AfterTest
	public void aftertesteg()
	{
		System.out.println("In the After Test Annotation ");
	}
		
	@Test(priority=3)
	public void testlogin2()
	{
		System.out.println("In the Test Annotation testlogin2");
	}
		
	@BeforeTest
	public void beforetesteg()
	{
		System.out.println("In the before Test Annotation ");
	}
	
	@Test(priority=2,dataProvider="testloginData")
	public void testlogin1(String uname, String password)
	{
		System.out.println("In the Test Annotation testlogin1");
	}
	
	@Test(priority=1)
	public void testlogin3()
	{
		System.out.println("In the Test Annotation testlogin3");
	}
	
	
	@BeforeMethod
	public void beforemethodeg()
	{
		System.out.println("-----------In the before method Annotation -------------");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("-----------In the after method Annotation -------------");
	}
	
	@DataProvider
	public Object[][] testloginData()
	{
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="u1";
		data[1][0]="u1";
		data[2][0]="u1";
		data[0][1]="p1";
		data[1][1]="p1";
		data[2][1]="p1";
		return data;	
			
	}

}
