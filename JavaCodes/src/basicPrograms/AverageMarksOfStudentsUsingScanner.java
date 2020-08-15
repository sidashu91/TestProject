
package basicPrograms;

import java.util.Scanner;

public class AverageMarksOfStudentsUsingScanner {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Marks of Student 1");
		float marksOfStudent1 = sc.nextFloat();
		
		System.out.println("Enter the Marks of Student 2");
		float marksOfStudent2 = sc.nextFloat();
		
		System.out.println("Enter the Marks of Student 3");
		float marsOfStudent3 = sc.nextFloat();
		
		float average =    (marksOfStudent1 +marksOfStudent2 +marsOfStudent3 )/3;
		
		System.out.println("********Average Marks of the 3  Students*****" +"\n" + average);
		
		
		
		
		
		
	}
}
