package testNGFrameWork;

import org.testng.annotations.Test;

public class DependsOnMethods_TestNgFeatures {
	
	
	
	@Test
	public void loginTest()
	{
		System.out.println("Login Test ");
		
		int i =9/0; //this will give an exception  and will fail the test
	}
	
	
	@Test(dependsOnMethods="loginTest")
	public void HomepageTest()
	{
		System.out.println("Home Page test");
	}
	
	

	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest()
	{
		System.out.println("SearchPageTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest()
	{
		System.out.println("SearchPageTest");
	}

}
