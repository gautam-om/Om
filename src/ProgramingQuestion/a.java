package ProgramingQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class a {

	public static void main(String[] args) {
		
		Integer[] num= {1,2,3,4,5,5,6,7,8,6,3};
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Collections.addAll(ar, num);
		System.out.println(ar);
		ar.remove(10);
		ar.remove(9);
		
		for(int i=0;i<ar.size(); i++)
		{
			for(int j=i+1; j<ar.size(); j++)
			{
				if(ar.get(i).equals(ar.get(j)))
				{
					System.out.println(ar.get(i));
				}
			}
		}
		

	}

}
