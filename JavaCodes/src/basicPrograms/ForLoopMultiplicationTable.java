package basicPrograms;

import java.util.Scanner;

public class ForLoopMultiplicationTable {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num= sc.nextInt();
		
		System.out.println("Enter The limit");
		int limit= sc.nextInt();
		
		
		for (int i=1; i <=limit; i++) {
			
			int multiplication = num*i;
			
			System.out.println(multiplication);
			
		}
	}

}
