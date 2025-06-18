package ProgramingQuestion;

public class MaximumLenghtString {

	public static void main(String[] args) {
		
		 String sentence = "I love programming in Java very much";
	        String[] words = sentence.split(" ");

	        // Apply similar logic to sort by word length
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].length() < words[j].length()) {
	                    // Swap words
	                    String temp = words[i];
	                    words[i] = words[j];
	                    words[j] = temp;
	                }
	            }
	        }

	        // Now words[0] has the longest word
	       // System.out.println("The maximum length word is: " + words);
	        System.out.println("The maximum length word is: " + words[0]);
	        System.out.println("Length of the word: " + words[0].length());

	}

}
