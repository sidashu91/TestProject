package stringHandling;

import java.util.HashMap;
import java.util.Map;

public class Find_Duplicate_Chars_In_A_String {

	public static void main(String[] args) {
		String blogName = "howtodoinjava dot com";
		char[] chars = blogName.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
			if (map.containsKey(chars[i])) {
				int counter = map.get(chars[i]);
				System.out.println(counter);
				map.put(chars[i], ++counter);
			}
			
			else {
				map.put(chars[i], 1);
			}
			{
			}

		}

	}

}
