package super_keyword;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the Roll Num, Name, Marks and Score");
	int rollnum= sc.nextInt();
	String Name= sc.next();
	int marks= sc.nextInt();
	int score= sc.nextInt();
	Sports sportsChildclass = new  Sports(rollnum, Name, marks,score);//Constructs are called at the time of object creation
	
	
	sportsChildclass.display();
}
	
	
}
