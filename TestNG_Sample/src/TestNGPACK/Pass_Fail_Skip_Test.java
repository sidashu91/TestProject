package TestNGPACK;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Pass_Fail_Skip_Test {
	
	
	@Test
	public void loginViaEmail() 
	{
		System.out.println("Login Via Email");
	}
	
	@Test
	public void loginViaFacebook() 
	{
		System.out.println("login Via  Facebook");
	}
	
	@Test
	public void loginViaTwitter() 
	{
		System.out.println("login Via  Twitter");
		
		throw new SkipException("Twitter Functionality does not work");
	}
	
	@Test
	public void loginViaOtherAccount() 
	{
		
		
		
		try {
		System.out.println("login Via  Other Account");		
		Assert.assertEquals("Siddharth", "Sid");
		}
		
		catch(Throwable e) 
		{		
		System.out.println(e);
		
	    }
		
		System.out.println("After Assert Function");//since this is used after the Assert failed , to execute it we should use try catch block
		}

}
