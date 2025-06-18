package sample;

import java.util.Arrays;

public class Anagram {
	
	public static boolean checkAnagram(String str1, String str2) {
		
		str1 =str1.replaceAll("\\s","").toLowerCase();
		str2 =str2.replaceAll("\\s","").toLowerCase();
		
		if(str1.length() !=str2.length()){
			
			return false;
		}
		
		char[] charArry1 = str1.toCharArray();
		char[] charArry2 = str2.toCharArray();
		
		Arrays.sort(charArry1);
		Arrays.sort(charArry2);
		
		
		
		return Arrays.equals(charArry1, charArry2);
		
	}

	public static void main(String[] args) {
		
		String str1 = "tomato";
        String str2= "matoto";
		
		if(Anagram.checkAnagram(str1, str2)) {
			
			System.out.println(str1+ " and " +str2+ " are Anagram. ");
		}else {
			System.out.println(str1+ " and " +str2+ " are Not Anagram. ");
		}
	}

}
