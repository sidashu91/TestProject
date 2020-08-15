package basicPrograms;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Range");
		int range = sc.nextInt();
		
		
		/*for (int i = 1; i <=50; i++) 
		{
			System.out.println(i);
		} */
		
		int sum = 0;
		for (int i=1;  i<=range; i++) {
			
			
			int sq = i*i;
			System.out.println("The Sqare of the range is "+sq);
				
		sum = sum+sq;
		//System.out.println("Sum of Square "+sum);
		}
		System.out.println("Sum of Square "+sum);
		
	}
	
	
}
