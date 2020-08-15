package single;

import java.util.Scanner;

public class Marks extends Student {
	
int marks;

void inputMarks() 
{
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter the Marks");
	marks = SC.nextInt();
	
	
}



void display() 
{
System.out.println(name+" "+rollNo+" "+marks);	

}

}
