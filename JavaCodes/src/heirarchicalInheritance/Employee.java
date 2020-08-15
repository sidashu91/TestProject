package heirarchicalInheritance;

import java.util.Scanner;

public class Employee extends Person {

	int empId;
	int salary;
	   void inputEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Emp ID  the Employee");	
	     empId = sc.nextInt();
	     System.out.println("Enter the Slary of  the Employee");	
          salary = sc.nextInt();	
	}
	
	void displayEmployee() 
	{
		System.out.println(name+"  "+age+" "+empId+"  "+ salary);
		
	}
	
}
