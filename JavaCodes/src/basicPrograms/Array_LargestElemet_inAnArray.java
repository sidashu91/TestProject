package basicPrograms;

import java.util.Scanner;

public class Array_LargestElemet_inAnArray {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the array");
		int size = sc.nextInt();
		
	     int arr[]= new  int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			 arr[i]= sc.nextInt();
		}
		
		
		int max= arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]> max) 
			{
				
				max= arr[i];
			}
			
		}
		
		System.out.println("Largest element is "+max);
		
		
	}
}
