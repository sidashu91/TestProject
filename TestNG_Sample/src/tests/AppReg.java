package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppReg 
{
	
	@Test
	public void register()
	{
		//create the class Soft Assert
		SoftAssert softassert = new SoftAssert();
		
		
		String expresult="Temp";
		String actresult="abcd";
		
		System.out.println("A");
		
		//Hard Assertions
		//Assert.assertEquals(actresult, expresult);
		
		//Soft Assertions		
		softassert.assertEquals(actresult, expresult);
		
		System.out.println("B");
		//Assert.assertTrue (20>3,"Not As Expected");
		
		softassert.assertAll();
		
	}
	
			
}
