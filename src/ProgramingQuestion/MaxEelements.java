package ProgramingQuestion;

public class MaxEelements {

	public static void main(String[] args) {
			
			int x[]= {20,10,30,40,50};
			//int x[]= {5,1,0,0,-1};
			
			for(int i=0; i<x.length; i++)
			{
				for(int j=i+1;j<x.length; j++)
				{
					
					if(x[i]>x[j] )
					{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					}
				}
			}
			
			for(int i=0; i<x.length;i++)
			{
				System.out.print(x[i]+" ");	
			}
			System.out.println();
			System.out.println("Max Elements is " +x[0]);
			System.out.println("Min Elements is " +x[x.length-1]);
			System.out.println("Second Elements is " +x[1]);
			System.out.println("Second Elements is " +x[x.length-2]);
		}
}

