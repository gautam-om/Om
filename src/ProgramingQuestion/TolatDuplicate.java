package ProgramingQuestion;

import java.util.HashSet;

public class TolatDuplicate {

	public static void main(String[] args) {
		// step 1 create set col to get only unique char of given string
		String s="OmPrakash";
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		// step 2 compare each char of set with all char of given string
		int totalnumofDuplicates=0;
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
			{
				totalnumofDuplicates++;
			
		    }
		 }
		
			System.out.println(totalnumofDuplicates);
		
	 

	}

}
