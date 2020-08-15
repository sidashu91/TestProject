package abstractAssignment;

import java.util.Scanner;

public class Circle  extends Shape
{
  float radius;
  final float pi = 3.14f;
	
  
  Circle()
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("**********Enter the Radius********** ");
	  radius = sc.nextFloat();
  }


@Override
float area() {
	return pi*radius *radius;
}


@Override
float peri() {
	return 2 *pi*radius;
}
	
}
