package basicPrograms;

public class SquareOfANumber {
	
	public static void main(String[] args) {
		//Square and Cube of a number :
		int num = 2;
		int square=  num * num;
		int cube = num *num*num;
		
		
		/* *********This is Multiline comment*************************
		 * Type casting explained 
		 * Non Typecated value
		 * Type Casted value
		 * **********Comments are non executable statement****
		 * */
		
		float pi=3.14f;
		int radius =2;
		int area =   (int) (pi* radius*radius);
		float area1= (pi* radius*radius);
		
		System.out.println("Non TYpe Casted Area= "+area1);
		System.out.println("Typecasted area : "+area);
		System.out.println("Square of the number is:"+square+"\n"+"Cube of the number"+cube);
		
	;
		
		
		
	}

}
