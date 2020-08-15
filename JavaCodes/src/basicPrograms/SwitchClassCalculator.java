package basicPrograms;

import java.util.Scanner;

public class SwitchClassCalculator {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***********CALCULATOR******************");
		System.out.println("+ ADD"+"\n"+"- Substract"+"\n"+"* Multiplication"+"\n"+"/ Division"+"\n"+"Enter e to exit"+"\n");
		
		System.out.println("Enter the FIRST NUMBER"+"\n");
		int num1= sc.nextInt();
		
		System.out.println("Enter the SECOND NUMBER");
		int num2= sc.nextInt();
		
		System.out.println("**Enter the Function**"+"\n");
		int ch = sc.next().charAt(0);
		
		
	switch (ch) {
	case '+':
		System.out.println("Addition of two numbers is =" +(num1+num2));
		break;
    
	case '-':
		System.out.println("Substraction of two numbers is =" +(num1-num2));
		break;
		
	case '*':
		System.out.println("Multiplication of two numbers is =" +(num1*num2));
		break;
	
		
		case '/':
			System.out.println("Division of two numbers is =" +(num1/num2));
			break;
			
			
		case 'e':
			System.exit(0);
		
	default:
		System.out.println("Invalid Choices");
		break;
	}
	
		
	}
}
