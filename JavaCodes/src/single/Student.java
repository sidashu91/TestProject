package single;

import java.util.Scanner;

public class Student {
	
	int rollNo;
	String name;
	
	//to perform a task to take input from user for rollNo and name
	void input() 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name ");
		name = sc.next();
		
		System.out.println("Enter the Roll number ");
		rollNo = sc.nextInt();
	}

}
