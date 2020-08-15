package basicPrograms;

import java.util.Scanner;

public class Loops1 {

	
	public static void main(String[] args) {
		
		
		//Ask size from user for array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size");
		int sz= sc.nextInt();
		
		//Declare the array
		
		int arr[] = new int[sz];
		
		System.out.println("Enter the Values");
		
		for (int i = 0; i < sz; i++) 
		{
			
			arr[i] = sc.nextInt();		
		}
		
		//Display the array seperately:
		
		for (int i = 0; i < sz; i++) {
			System.out.print(arr[i]);
		}
	}
}
