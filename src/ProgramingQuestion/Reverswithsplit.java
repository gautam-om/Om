package ProgramingQuestion;

public class Reverswithsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Om Prakash Gautam";
		String[] word = s1.split(" ");
		
		for( String w:word)
		{
			
			for(int i=w.length()-1; i>=0; i--)
			{
				
				System.out.print(w.charAt(i));
			}
			System.out.print(" ");
		}


	}

}
