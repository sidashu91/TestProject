package wrapper_class;

public class Wrapper_class {
	
	
	public static void main(String[] args) {
		
		
		String s ="2";
		//convert String to Interger :
		
		int n = Integer.parseInt(s);
		System.out.println("Square of the number : "+ n*n);
		
		
		//Take radius in String And calculate the area of Circle (float)
		
		String radiusInstring= "2.3";
		
		float radiusInFloat= Float.parseFloat(radiusInstring);
		
		System.out.println("Circumference of the Circle is  " +(2 *3.14*radiusInFloat));
		
		
	}

}
