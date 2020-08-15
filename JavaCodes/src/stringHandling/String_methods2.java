package stringHandling;

public class String_methods2 {
	
	
	public static void main(String[] args) {
		
		String s1= "Java";
		String s2 = "is a Programming language";
		
	//------concat---//----------------	//String s1 + s2 
		String s3= s1.concat(s2);
		System.out.println(s3);
				
	String str = "Java is a programming language";
	
	System.out.println("Length os the String "+ str.length());
	System.out.println("Converts to UpperCase : "+ str.toUpperCase());	
	System.out.println("Converts to lower case :"+ str.toLowerCase());
	System.out.println("To check the starting of the String  :"+str.startsWith("Java"));
	System.out.println("To check String Ends with "+str.endsWith("zz"));
	System.out.println("Replace the String "+ str.replace("Java", "Python"));
	}

}
