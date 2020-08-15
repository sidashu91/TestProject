package single;

public class Dog  extends Animal{

	String  color = "White"; 
	
	void printColor ()
	{
		
		System.out.println(this.color);//pointing to current class
		System.out.println(super.color);//pointing to immmidiate parent class
	}


	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
	}
}


