package arrays_and_strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique
 * characters. What if you cannot use additional data structures?
 * 
 * @author ivocalado
 *
 */
public class P_01_IsUnique {
	boolean isUnique(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (!set.add(str.charAt(i)))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "AhnavizljsU";
		System.out.println(new P_01_IsUnique().isUnique(s));
	}
}
