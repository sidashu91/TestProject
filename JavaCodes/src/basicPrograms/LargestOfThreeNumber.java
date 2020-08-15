package basicPrograms;

import java.util.Scanner;

public class LargestOfThreeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the FIRST Number"+"\n");
		int num1=sc.nextInt();
		
		
		System.out.println("Enter the SECOND Number"+"\n");
		int num2=sc.nextInt();
		
		System.out.println("Enter the THIRD Number"+"\n");
	    int num3 =sc.nextInt();
	    
	    //Using AND orperator
	   
	   /*if (num1> num2 && num1 > num3) 
	   {
		   System.out.println("First Number is Greater");
	   }
	   
	   
	   else if (num2> num1 && num2 > num3) 
	   {
		   System.out.println("Second Number is Greater");
	   }
	   
	   else  
	   {
		   System.out.println("Third Number is Greater");
	   } */
		
	//Nested If:
		
		if(num1 >num2) 
		{// first if---------------------------------------------------
			if (num1> num3) 
			{
				System.out.println(num1+"is Greater");
			}
			
			else 
			{
				System.out.println(num3+" is Greater");
			}
			
		  } //first if----------------------------------
		
		if (num2> num3) 
		{// second if -------------
			if (num2>num3) 
			{
				System.out.println(num2+" Is greater");
			}
			
			else 
			{
				System.out.println(num3+" is Greater");
			}
			
		 } //second if--------------------------
		
		else //common else----------------
		{
			System.out.println(num3+" is greater");
		}
		
	}// main ends here
	
	
}
