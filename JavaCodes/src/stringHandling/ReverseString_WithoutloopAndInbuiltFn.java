package stringHandling;

public class ReverseString_WithoutloopAndInbuiltFn {
	static String reverse(String str) {
		if (str.length() == 0)
			return "";

		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {
		System.out.println(reverse("Siddharth"));
	}

}
