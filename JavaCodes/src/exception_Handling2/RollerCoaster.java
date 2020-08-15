package exception_Handling2;

import java.util.Scanner;

//Create an Age exception class witj constructor.
//Carete a Roller coater class
//with a method to validate the age for ride
//-- take age from user

//1) if age is less than 12 -exception and print a message "You should have come after ----years"
//2) if age is greater  than 65 -exception and print a message "You should have before ----years"
//3) Enjoy the ride
public class RollerCoaster


{
	
	void validateAge() throws AgeOutOfBound
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		
		
		
		if (age <12) 
		{
			throw new AgeOutOfBound("You should have come after" +(12-age)+ "years");
			
		}
		
		if (age >65) 
		{
			System.out.println("You should have come Before "+(age-65)+"Years" );
			
		}
		
		else 
		{
			System.out.println("Enjoy the ride");
		}
	}

	
	
	public static void main(String[] args) 
	
	{

		RollerCoaster r= new RollerCoaster();
		try {
			r.validateAge();
		} catch (AgeOutOfBound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
