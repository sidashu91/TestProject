package basicPrograms;

import java.util.Scanner;

public class Arrays_SumOfElements {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		 System.out.println("Enter the Size of the Array");
		 int sz = sc.nextInt();
		 int arr[] = new int[sz];
		 
		 
		 System.out.println("Enter the Values");
		 for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();	
			 
		}
		
		 int sum =0;
		 for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				sum = sum+ arr[i];
			 
		}
		 
		 System.out.println("Sum of the Elements is : "+sum);
	}
	

}
