package ProgramingQuestion;

import java.util.LinkedHashSet;

public class UniqueChar {

	public static void main(String[] args) {
		
		String s="Gautam";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>(); 
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
			//System.out.print(set);
		}
		for(Character ch:set)
		{
		System.out.print(ch);
		}
	}

}
