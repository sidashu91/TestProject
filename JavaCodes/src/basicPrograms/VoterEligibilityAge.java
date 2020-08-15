package basicPrograms;

import java.util.Scanner;

public class VoterEligibilityAge {

	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the Age of the Voter"+"\n");
		
		int age = sc.nextInt();
		// Voter age is greater than or equal to 18
		
		if ( age >=18) 
		{
			System.out.println("The voter is eligible to Vote");
		}
		
		else{
			
			System.out.println("Voter is not eligibel to Vote");
		}

	}

}
