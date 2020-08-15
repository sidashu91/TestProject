package basicPrograms;

import java.util.Scanner;

public class ForLoopFactorial {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey User, Please Enter a Number ;) "+"\n");
		int num= sc.nextInt();
		
		
		int fact = 1;
		for (int i = 1; i <=num; i++) 
		{
		fact = fact* i;
		System.out.print("\t"+fact);	
		}
		
		System.out.println("\t"+"Factorial is "+ fact);
		
	}
}
