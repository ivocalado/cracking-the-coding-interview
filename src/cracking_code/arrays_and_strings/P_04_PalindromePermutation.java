package cracking_code.arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a
 * permutation of a palin-drome. A palindrome is a word or phrase that is the
 * same forwards and backwards. A permutation is a rearrangement of letters. The
 * palindrome does not need to be limited to just dictionary words
 * 
 * @author ivocalado
 *
 */
public class P_04_PalindromePermutation {
	boolean checkPalindrome(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}

		if ((str.length() % 2) == 0) {
			for (Character c : map.keySet()) {
				if ((map.get(c) % 2) != 0)
					return false;
			}
		} else {
			boolean oddElement = false;
			for (Character c : map.keySet()) {
				if ((map.get(c) % 2) != 0) {
					if (!oddElement)
						oddElement = true;
					else
						return false;
				}

			}
		}
		return true;

	}

	public static void main(String[] args) {
		String str = "trteer";
		System.out.println(new P_04_PalindromePermutation().checkPalindrome(str));
	}
}
