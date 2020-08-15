package abstractAssignment;

import java.util.Scanner;

public class Rectangle extends Shape{
	
	
float length ;
float breadth;

public Rectangle() 
{

	Scanner sc= new Scanner(System.in);
	System.out.println("*************Enter the Length ************");
	length =sc.nextFloat();
	
	System.out.println("********Enter the Breadth*****" );
	breadth = sc.nextFloat();
	
}

	@Override
	float area() {
		return length * breadth;
	}

	@Override
	float peri() {
		// TODO Auto-generated method stub
		return 2 * (length + breadth); 
	}
	
	
	
	

}
