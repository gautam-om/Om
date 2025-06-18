package ProgramingQuestion;

import java.util.HashSet;

public class NumberOccrnce {  

	
	public static void main(String[] args) 
	{
	// step 1 create set col to get only unique char of given string
	String s="Deeraj";
	HashSet<Character> set = new HashSet<Character>();
	for(int i=0; i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	System.out.println(set);
	// step 2 compare each char of set with all char of given string
	for(Character ch : set)
	{ 
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		if(count>1)
		// step 3 print char and count
		//System.out.println(ch+" = "+count);
		System.out.println("Print Duplicate Character -"+ch);
	}
	
  }
    
}
