package interfaces;

public interface A {
	
	
	int a=0;
	 static void print() 
	{
	System.out.println("Static menthod called ");
	
	}
	
	default void display()
	{
		
		
		System.out.println("default methood called");
	}

	
       abstract void msg();

       int add (int a , int b);
       
       
}
