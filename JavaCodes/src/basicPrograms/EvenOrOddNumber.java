package basicPrograms;

import java.util.Scanner;

public class EvenOrOddNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Number to check even or odd "+"\n");
		Scanner sc = new Scanner(System.in);
		
		int num =  sc.nextInt();
		
		//Check if number is even or odd 
		
		if ((num%2)==0) // mod % says about remainder value
		
		{
			System.out.println("Number is Even");
			
		}
		
		else 
		{
			System.out.println("Numebr is odd");
		}
		
		
	}

}
