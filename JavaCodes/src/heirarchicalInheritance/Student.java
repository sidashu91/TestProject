package heirarchicalInheritance;

import java.util.Scanner;

public class Student extends Person{

	int rollNo;
	int marks;
	void inputStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roll number of the Student");	
	     rollNo = sc.nextInt();
	     System.out.println("Enter the Marks of  the Student");	
          marks = sc.nextInt();	     
	     
	}
	
	
	void displayStudent() 
	{
		System.out.println(rollNo+"  "+marks+" "+name+"  "+ age);
		
	}
	
	
	
	
	
}
