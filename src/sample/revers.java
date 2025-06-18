package sample;

public class revers {

	public static void main(String[] args) {
		
		 String s="My name is Om Prakash";
	        String[] s1=s.split(" ");
	        
	        for(String s2:s1)
	        {
	        	String rev="";
	          for(int i=s2.length()-1;i>=0;i--) {
	        	  
	        	  rev = rev+s2.charAt(i);	  
	        	  
	          }
	          
	          System.out.print(rev+" ");
	        
	        }

	}
	
	


}
