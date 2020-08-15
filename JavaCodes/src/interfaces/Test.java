package interfaces;



public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.display();
		b.msg();
		
		
		System.out.println("Sum of two numbers is "+b.add(2, 2));
		
		A.print();
		
		
	}
	

	
	
}
