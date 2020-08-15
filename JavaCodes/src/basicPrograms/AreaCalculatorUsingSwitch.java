package basicPrograms;

import java.util.Scanner;

public class AreaCalculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("\n"+"Choose Whose Area you want to calculate :"+
		"\n"+"* Square"+"\n"+"* Rectangle"+"\n"+"* Triangle"+"\n"+"* Circle");
		
	    System.out.println("*****************************************");
		
	    System.out.println("Please enter the Choice from above Menu:"+"\n");
	    String choice = sc.next();
	    		
		switch (choice) {
		
		       case "Square":
			   System.out.println("Please enter the lenghth of the side of Square");
			   float sideLength = sc.nextFloat();
			   float areaOfSquare = sideLength*sideLength;
			   System.out.println("----------*****------------"+"\n"+"Area of the Square is :" +areaOfSquare);	
			   System.out.println("----------******-----------");
			   break;
         
			
		        case "Rectangle":
		        System.out.println("Please enter the legth of Rectangle");
		        float l = sc.nextFloat();
		        System.out.println("Please enter the breadth of Rectangle");
		        float b = sc.nextFloat();
		        float areaOfRectangle= l*b;
				System.out.println("Area of the Rectangle is :"+areaOfRectangle);
				 System.out.println("----------******------------");
				break;	
				
		case "Triangle":
			System.out.println("Please enter the base of the triangle");
			float base = sc.nextFloat();
			
			System.out.println("Please enter the height of the triangle");
			float height = sc.nextFloat();
			
			float areaOfTriangle= (base*height)/2;
			System.out.println("Area of the Triangle is : "+areaOfTriangle);
			 System.out.println("----------******------------");
		break;	
			
        case "Circle":
        	System.out.println("Please enter the Radius of the circle");
        	float radius = sc.nextFloat();
        	float pie =3.14f;
        	float areaOfCircle = 2* pie * radius ;
   		System.out.println("Area of the Circle is : "+areaOfCircle);
   	 System.out.println("----------******------------");
       	
			break;
			
			case "e":
				System.exit(0);
			
		    default:
		    	
	    System.out.println("Choice is invalid");
	    System.out.println("----------******------------");
			break;
		}
		

		} 
		while(true);
//		do {
//			System.out.println("Please enter the base of the triangle");
//			float base = sc.nextFloat();
//			
//			System.out.println("Please enter the height of the triangle");
//			float height = sc.nextFloat();
//			
//			float areaOfTriangle= (base*height)/2;
//			System.out.println("Area of the Triangle is : "+areaOfTriangle);
//			
//		} 
//		while (choice=="Triangle");
//		
//		
//		do {
//		    System.out.println("Please enter the lenghth of the side of Square");
//		   float sideLength = sc.nextFloat();
//		   float areaOfSquare = sideLength*sideLength;
//		   System.out.println("Area of the Square is :" +areaOfSquare);	
//			
//		} 
//		 while (choice=="Square");
//		
//		
//		do {
//			System.out.println("Please enter the Radius of the circle");
//    	float radius = sc.nextFloat();
//        	float pie =3.14f;
//       	float areaOfCircle = 2* pie * radius ;
//    		System.out.println("Area of the Circle is : "+areaOfCircle);
//		} while (choice=="Circle");
//		
//		
//       do{
//    	   System.out.println("Please enter the legth of Rectangle");
//           float l = sc.nextFloat();
//	        System.out.println("Please enter the breadth of Rectangle");
//	        float b = sc.nextFloat();
//	        float areaOfRectangle= l*b;
//			System.out.println("Area of the Rectangle is :"+areaOfRectangle);
//			
//		} while (choice=="Rectangle");
//       
//       do {
//		
//    	   System.out.println("Choice is not valid");
//	} while (choice!="Rectangle" || choice!="Circle" || choice !="Square" || choice!="Triangle");
		
		
		
	}
	
	

}
