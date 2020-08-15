package exception_Handling;



public class Excep1 {
	
public static void main(String[] args) {
	
try {
	
	

	int arr[] = new int [3];
	arr[6]=90;
	
		int div = 2/0;
		System.out.println(div);
		
	}
	
//	catch (ArithmeticException e)
//    {
//        // System.out.println(e);
//		e.printStackTrace();
//    }

catch (ArithmeticException | ArrayIndexOutOfBoundsException e) 
{
   e.printStackTrace();
}
	
}


	
}
