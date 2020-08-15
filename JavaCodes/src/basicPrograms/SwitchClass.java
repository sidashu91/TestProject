package basicPrograms;

import java.util.Scanner;

public class SwitchClass {
	
	public static void main(String[] args) {
		
	System.out.println("1.Veg"+ "\n"+"2.Non Veg");
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the Choice");
	int choice = sc.nextInt();
	
	switch (choice)
	
	{// switch starts--------------------
	case 1:
		System.out.println("Food is Veg");
		break;
	case 2 :
		System.out.println("Food is Non Veg");
	    break;
	    
	    default:
	    System.out.println("Invalid Entry");
	} //switch ends------------------------
		
	}

}
