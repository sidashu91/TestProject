package basicPrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number1"+"\n");
		int num1 = sc.nextInt();
		
		
		System.out.println("Enter the Number2"+"\n");
		int num2 = sc.nextInt();
		
	
		
		if (num1>num2) 
		{
			System.out.println("Number1 is the Largest Number"+"\n");
		}
		
		else if(num2 > num1) 
		{
			
			System.out.println("Number 2 is the Largest Number");
		}
		
		}
	}


