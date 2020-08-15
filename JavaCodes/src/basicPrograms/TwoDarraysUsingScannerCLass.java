package basicPrograms;

import java.util.Scanner;
 
public class TwoDarraysUsingScannerCLass {

	public static void main(String[] args)
{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Row");
		int row = sc.nextInt();
		
		System.out.println("Enter the Column");
		int col = sc.nextInt();
		
		//Declare a 2 D Array 
		int arr [][] = new int [row][col];
		System.out.println("Enter the Values");
		
		
		for (int i = 0; i <row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				
				arr[i][j]= sc.nextInt();
				
			}
		}
		
		//transposed :
		System.out.println("normal Value "+"\n");
		for (int i = 0; i <row; i++)
		{
			for (int j = 0; j < col; j++) 
			{
				
				System.out.print(arr[i][j]+"   ");//normal
								
			}
			System.out.println();
		}
		
		System.out.println("transpose Result :");
		for (int i = 0; i <row; i++)
		{
			for (int j = 0; j < col; j++) 
			{
				
				System.out.print(arr[j][i]+"   ");//transpose
								
			}
			System.out.println();
		}
		
		
		
		//
	}
	
	
}
