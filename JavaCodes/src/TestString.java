
public class TestString {

	// INPUT : 1234sdsad#!@$
	// OUTPUT: sdsad#!@$1234

	public String stringMethod(String input) {

		if (0 == input.length()) {
			return "";

		}

		return input.charAt(input.length() - 1) + stringMethod(input.substring(0, input.length() - 1));

	}
	
	
	public String stringCount(String input) 
	{
		String words[]= input.split(" ");
		
		
		int count =0;
		for (String string : words) {
			
			System.out.println(string);
			if (string.contains(words.toString())) {
				count = count +1;
				
			}
			System.out.println(count);
			
			
			
		}
		
		
		
		return"";
	}

	public static void main(String[] args) {

		TestString revString = new TestString();
		System.out.println(revString.stringMethod("1234sdsad#!@$"));
		
		revString.stringCount("big black bug bit a big black dog on his big black nose");
		

	}

}
