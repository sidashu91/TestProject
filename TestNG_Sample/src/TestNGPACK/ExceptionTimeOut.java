package TestNGPACK;
import org.testng.annotations.Test;

public class ExceptionTimeOut {
	
	@Test(priority=1,timeOut=2000)
	public void infiniteLoop()
	{
		
		int i=1;
		while (i==1) 
		{
		System.out.println(i);	
			
		}
		
	}
	
@Test(expectedExceptions= NumberFormatException.class)
public void exceptions()
{
	String a= "100A";
int b= Integer.parseInt(a);
}
		@Test(priority=2,invocationTimeOut=2000)
		public void infiniteLoo2()
		{
			
			int i=1;
			while (i==1) 
			{
			System.out.println(i);	
				
			}	
			
			
		
	}

}
