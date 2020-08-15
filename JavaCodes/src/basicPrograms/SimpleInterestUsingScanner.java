package basicPrograms;

import java.util.Scanner;

public class SimpleInterestUsingScanner {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Principle");
		 
		float principle= sc.nextFloat();
		
		
		System.out.println("Enter Rate");
		int rate = sc.nextInt();
		
		System.out.println("Enter the Time");
		float time= sc.nextFloat();
		
		float interest = (principle * rate* time)/100 ;
		System.out.println("The Simple Interezst is = "+ interest);
		
		
		
	}
	
	
	
	
	
	

}
