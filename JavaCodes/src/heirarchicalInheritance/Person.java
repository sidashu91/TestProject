package heirarchicalInheritance;

import java.util.Scanner;

public class Person {
String name;
int age ;

void inputPerson() 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Name of the Person");
name= sc.next();

System.out.println("Enter the Age of the Person");
age= sc.nextInt();


}
	
	
}
