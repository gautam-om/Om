package ProgramingQuestion;

public class SumFirstThreeEle {

	public static void main(String[] args) {

			int x[]= {20,10,30,40,50};
			
			for(int i=0; i<x.length; i++)
			{
				for(int j=i+1;j<x.length; j++)
				{
					if(x[i]<x[j])
					{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				//	System.out.println(x[i]);
					}
					
				}
			}
			int sum=0;
			for(int i=0; i<=2;i++)
			{
				//System.out.println(x[i]);
				sum=sum+x[i];
			}
			System.out.println(sum);
		}

}
