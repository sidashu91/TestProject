package testNGFrameWork;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(invocationCount=10)
	public void sum()
	{
		int a=1;
		int b= 2;
		int c = a+b;
		
		System.out.println("The Sum is : "+c);
		
		
	}
	
	

}
