package exception_Handling;

public class Try_Catch_Finally {
	
	
	public static void main(String[] args)
	{
	
		try {
			int div = 8/2;
			System.out.println(div);
			
			
		} 
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Statements Executed");
		}
		
		//try finally block 
		try {
			int div = 8/0;
			System.out.println(div);
			
		    } 
		
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		 finally {
			 System.out.println("Statement 2 Executed");
		         }
		
	}
	
	
	
	

}
