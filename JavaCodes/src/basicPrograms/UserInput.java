package basicPrograms;

import java.util.Scanner; //Scanner Imported

public class UserInput {

	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in); // Creating Scnanner class object
		
		/*int rollNum= 101;
		String name = "ABC";
		float marks= 98.7f;
	    char grade = 'A';
		*/
		
		System.out.println("Enter your Name:" );		
		String name= sc.next();
		
		System.out.println("Enter your Roll Number:" );
	    float rollNum =sc.nextInt();	
	    
	    System.out.println("Enter your grade");
	    char grade = sc.next().charAt(0);
	    
	    
	    
	    System.out.println("Enter your Marks ");
	    
	    float marks = sc.nextFloat();
	    
	    System.out.println("***Student Details***"+"\n"+"Student Name:"+name+"\n"+
	    	    "Student Roll number is:"+rollNum+
	    	    "\n"+"Student Marks are :"+marks+"\n"+"Student Grade is "+grade );
	    
	  
	    
	    
	    
	}
}
