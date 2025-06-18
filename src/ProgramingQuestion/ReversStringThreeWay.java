package ProgramingQuestion;

public class ReversStringThreeWay {

	public static void main(String[] args) 
	{
		// Without using println or third variable.
		String name2="Prakash Gautam";
		//String[] name2 = name.split(" ");
		
		for(int i=name2.length()-1; i>=0; i--)
		{
			System.out.print(name2.charAt(i));
			//System.out.print(b);
		}
		System.out.println();
		
System.out.println("*************************************************************");
		
       //By using println or third variable. 
       String name1="Gautam"; 
       int num = name1.length();
       String rev="";
		
		for(int i=num-1; i>=0; i--)
		{
			rev=rev+name1.charAt(i);
		}
		System.out.println(rev);
		
System.out.println("*************************************************************");
		
         //Whitout using lenght() or lenght variable
		 String nme="OmPrakash"; 
		 char ch [] = nme.toCharArray();
	       
	        int count=0;
			for(char c : ch)
			{
				count++;
			}
			
			String res="";
			for(int i=count-1; i>=0;i--)
			{
				res=res+nme.charAt(i);
			}
			System.out.println(res);
			
			System.out.println("*************************************");		
	
	}

}
