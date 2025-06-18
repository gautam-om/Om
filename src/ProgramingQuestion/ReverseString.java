package ProgramingQuestion;

public class ReverseString {

	public static void main(String[] args) 
	{
	    String s="Om Prakesh Gautam";
		String[] str=s.split(" ");
//		System.out.println(str);
	  for(int i=0; i<str.length; i++)	
	  {
		 String temp = str[i];
		 System.out.println(temp);
		for(int j=temp.length()-1;j>=0;j--)
		{
			System.out.print(temp.charAt(j));
		}
		System.out.print(" ");
	  }
		
	}	
}	

