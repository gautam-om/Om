package ProgramingQuestion;

import java.util.HashSet;

public class WordTolatDuplicate {

	public static void main(String[] args) {
		// step 1 create set col to get only unique char of given string
				 String s="Om Prakash Gautam Om Prakash";
				 String str[]=s.split(" ");
				HashSet<String> set = new HashSet<String>();
				for(int i=0; i<str.length;i++)
				{
					set.add(str[i]);
				}
				// step 2 compare each char of set with all char of given string
				int totalnumofDuplicates=0;
				for(String word : set)
				{
					
					int count=0;
					for(int i=0; i<str.length;i++)
					{
						if(word.equals(str[i]))
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
