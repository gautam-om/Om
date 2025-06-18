package ProgramingQuestion;

import java.util.ArrayList;

public class ShortAllelement {

	public static void main(String[] args) {
	
		int[] x= {0,1,0,1,0,1,0,1,0,1};//{20,10,30,40,50};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<x.length; i++)
		{
			for(int j=i+1;j<x.length; j++)
			{
				if(x[i]>x[j])
				{
				int temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			//	System.out.println(x[i]);
				}
				
			}
		}
		
		for(int i=0; i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
	

}
