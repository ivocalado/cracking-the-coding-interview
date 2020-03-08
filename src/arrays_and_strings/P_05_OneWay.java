package arrays_and_strings;

public class P_05_OneWay {
	boolean checkEdit(String str1, String str2) {
		if(Math.abs(str1.length() - str2.length()) > 1)
			return false;
		
		if(str1.length() == str2.length()) {
			boolean hasModification = false;
			for(int j = 0; j < str1.length(); j++) {
				if(str1.charAt(j) != str2.charAt(j)) {
					if(!hasModification)
						hasModification = true;
					else 
						return false;
				}
			}
		} else if(str1.length() > str2.length()) {
			
		} else {
			
		}
		
		
		
		
		
		return true;
	}
}
