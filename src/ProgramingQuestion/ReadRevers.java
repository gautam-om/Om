package ProgramingQuestion;

public class ReadRevers {

	public static void main(String[] args) {
		
		String names="Om1Prakesh2Gautam3Ravi";
		String uper = names.toUpperCase();
		String name=uper.replaceAll("[0-9]", " ");
		String rev2="";
		for(int i=name.length()-1; i>=0; i--)
		{
			rev2=rev2+name.charAt(i);
			//System.out.println(name.charAt(i));
			
		}
		System.out.println("Reverse All String-->  "+"( "+rev2+" )");

		
		System.out.println("**************************************************");
		
		String s="Om1Prakesh2Gautam3Ravi";
		String s2=s.replaceAll("[0-9]", " ");
		String[] str=s2.split(" ");
		String revstr="";
		//String strRev="";
		for(String w:str)
		{
			String rev="";
			for(int i=w.length()-1; i>=0; i--)
			{
				rev=rev+w.charAt(i);
			}
			revstr=revstr+rev+" ";
		}
		System.out.println("Reverse Each Words--> "+"( "+revstr+" )");
	}

}
