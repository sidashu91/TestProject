package stringHandling;

public class StringBuilder1 {
	
	
	public static void main(String[] args) 
	{
	
		
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" a language");
		System.out.println(sb+" ------>After Appending ");
		
		
		
		sb.insert(4, "is");
		System.out.println(sb);
		
		
		sb.delete(1, 11);//index 1 starts with 0
		System.out.println(sb);// lenghth 11 counted from 1 to 11 
		
	sb.deleteCharAt(1); //index 1
	System.out.println(sb);
	
	sb.replace(1, 2, "zzzz");
	System.out.println(sb);
	
	sb.reverse();
	System.out.println(sb);
	
	System.out.println("Length :"+sb.length());
	
	}

}
