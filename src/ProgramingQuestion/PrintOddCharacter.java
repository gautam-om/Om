package ProgramingQuestion;

public class PrintOddCharacter {

	public static void main(String[] args) {
		// Even Number
		String s= "Pragati";
		         //0123456
		for(int i=0; i<=s.length()-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(s.charAt(i));
			}
		}
		
		System.out.println("**********************************");
		  // odd Number
	     	String s1= "Pragati";
       
           for(int i=0; i<=s.length()-1;i++)
            {
	         if(i%2!=0)
	           {
		         System.out.println(s.charAt(i));
	           }
            }

	}

}
