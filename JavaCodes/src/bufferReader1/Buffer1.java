package bufferReader1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer1 
{

public static void main(String[] args) throws IOException {
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader bfr= new BufferedReader(in);
	
	System.out.println("Enter the Name ");
	String name = bfr.readLine();//TAKES STRING VALUE
	
	System.out.println("Your Name is "+name);
	
	
	//Convert to Integer by using Wrappr class
	
	System.out.println("Enter the Number ");
    String numInString = bfr.readLine(); 
    
    int num= Integer.parseInt(numInString);
    System.out.println(num*num);
    bfr.close();
    
}
}
