package ProgramingQuestion;

import java.util.LinkedHashSet;

public class WordRemoveDuplicate {

	public static void main(String[] args) {
		
		String s="Om Prakash Gautam Om Gautam";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String word : set)
		{
			System.out.println(word+" ");
		}

	}

}
