package arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Check Permutation: Given two strings, write a method to decide if one is a
 * permutation of the other.
 * 
 */
public class P_02_CheckPermutation {

	boolean checkPermutation(String str1, String str2) {
		Map<Character, Integer> counterStr1 = new HashMap<>();
		Map<Character, Integer> counterStr2 = new HashMap<>();

		if (str1.length() != str2.length())
			return false;

		for (int i = 0; i < str1.length(); i++) {
			counterStr1.put(str1.charAt(i), counterStr1.getOrDefault(str1.charAt(i), 0) + 1);
			counterStr2.put(str2.charAt(i), counterStr2.getOrDefault(str2.charAt(i), 0) + 1);
		}

		for (Character element : counterStr1.keySet()) {
			if (!counterStr2.containsKey(element) || !counterStr1.get(element).equals(counterStr2.get(element)))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "BCA";

		System.out.println(new P_02_CheckPermutation().checkPermutation(s1, s2));
	}

}
