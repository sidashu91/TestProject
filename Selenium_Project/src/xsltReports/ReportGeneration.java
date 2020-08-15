package xsltReports;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportGeneration {
	
	
	@Test
	public void test1() 
	{
		System.out.println("Test 1");
	}
	
	
	@Test
	public void test2() 
	{
		System.out.println("Test 2");
		Assert.assertEquals("Sid", "Sidd");
	}
	
 

}
