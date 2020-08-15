package stringHandling;

public class String_Methods {

	public static void main(String[] args) 
	{
		
		//--------------Comparision------------//
	String string1= "Hello";
	String stringCommon= "Hello";
	String string2= new String ("hello");
	
	System.out.println(string1.equals(stringCommon));
	//it does not matter if the string matter if the strings are created in different ways
	
	
	System.out.println(string1==stringCommon); // strictly compares the ways 
	System.out.println(""+string1.equalsIgnoreCase(string2)); // ignores the upper and lower cases
	
	
	//-----------Index of -------------//----starts with 0-
	
	String s1 ="Java is a Programming Language";
	
	System.out.println(s1.lastIndexOf("is")+"Last Index of is");
	System.out.println(s1.indexOf("ge"));
	
	//------------String Extraction ---------------//---count with 1 generally----
	
	String s2 = "Java is a Programming Language";
	
	System.out.println(s2.substring(1)+"   Subsstring 1");
	
	System.out.println(s2.substring(0, 7));
	
	//---------String Splitting ------------//
	
	String words[]= s2.split(" ");
	String words1[] = s2.split(" ",3);
	
	for (String w : words) {
		System.out.println(w);
	}
	
	for (String string : words1) {
		System.out.println("Split with two Agrgue ments : "+"\n"+string);
		
	}
	
	//---
	
	
	
	}
	
}
