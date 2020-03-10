package cracking_code.arrays_and_strings;

/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3, If the "compressed" string would not become smaller than the
 * original string, your method should return the original string. You can
 * assume the string has only uppercase and lowercase letters (a - z).
 * 
 * @author ivocalado
 *
 */
public class P_06_CompressString {
	String doCompression(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int counter = 0;
			while (i < str.length() && str.charAt(i++) == c)
				counter++;
			if (i < str.length())
				i -= 2;
			result += c;
			result += counter;
		}

		return (result.length() < str.length()) ? result : str;
	}

	public static void main(String[] args) {
//		String str = "aabbcccccaaa";
		String str = "qqqqqqqqqqqwsdscscddd";
		System.out.println(new P_06_CompressString().doCompression(str));
	}
}
