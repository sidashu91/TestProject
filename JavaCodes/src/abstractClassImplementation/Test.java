package abstractClassImplementation;

public class Test {
	
	public static void main(String[] args) {
		
		
	//	A a = new A(); ---> Cannot create obj of abstract class
		
		A obj = new B();
		obj.msg();
		System.out.println("Addition is : "+obj.add(2, 3));
		
		
		
	}

}
