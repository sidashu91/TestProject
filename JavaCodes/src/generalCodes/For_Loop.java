package generalCodes;

public class For_Loop {
	
	static int counter= 0;
	public static void main(String[] args)
	{
		for (int i = 1; i <=100; i++) 
		{
			System.out.println(i);
			int temp = counter + 1;
			counter= temp;
			System.out.println("counter is :"+counter);
			
			
		}
		
		
		
		
	}

}
