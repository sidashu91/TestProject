package interface_Assignments;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle");
		
		float radius = sc.nextFloat();
		Circle circle = new Circle();
		
		System.out.println("Are of Circle "+circle.area(radius));
		System.out.println("Circumference of the Circle "+circle.circum(radius));
		System.out.println("DIameter of the Circle "+ circle.diameter(radius));
		
	}

//	16\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
}
