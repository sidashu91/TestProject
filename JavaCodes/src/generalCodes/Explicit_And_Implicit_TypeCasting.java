package generalCodes;

public class Explicit_And_Implicit_TypeCasting {

	
	public void implicitTypeCasting() 
	{   
		
		System.out.println("\n"+"**********************Implicit Type Cast***************"+"\n");
		int i = 300;
        long l = i;     //no explicit type casting
        float f = l;    //no explicit type casting
        System.out.println("int value " + i);
        System.out.println("long value " + l);
        System.out.println("float value " + f);
	}
	
	public void explicitTypeCasting()
	{
		
	System.out.println("\n"+"**************Explicit Type Cast*********************"+"\n");	
	double d = 234.04;
    long l = (long)d;   //explicit type casting
    int i = (int)l;     //explicit type casting
    System.out.println("double value " + d);
    System.out.println("long value " + l);
    System.out.println("int value " + i);
	}
	
	public static void main(String[] args) 
	{

		Explicit_And_Implicit_TypeCasting obj= new Explicit_And_Implicit_TypeCasting();
		obj.implicitTypeCasting();
		obj.explicitTypeCasting();
	    
	    
	    
	}
}
