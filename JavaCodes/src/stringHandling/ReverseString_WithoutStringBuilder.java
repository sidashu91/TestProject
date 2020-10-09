package stringHandling;

public class ReverseString_WithoutStringBuilder {

	public static String reverseStringMethod(String input) {
		if (input.isEmpty() || input == null) {
			return input;

		}

		String reverse = "";

		int stringlength = input.length();

		for (int i = stringlength - 1; i > 0; i--) {

			reverse = reverse + input.charAt(i);

		}

		return reverse;

	}

	public static void main(String[] args) {
		System.out.println(reverseStringMethod("Siddharth Chaturvedi"));

	}

}
