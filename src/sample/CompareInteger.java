package sample;

public class CompareInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer t1 = 127;
		Integer t2 = 127;
		System.out.println(t1==t2);
		
		Integer t3 = 128;
		Integer t4 = 128;
		System.out.println(t3==t4);
		
		Integer t5 = new Integer(127);
		Integer t6 = new Integer(127);
		
		System.out.println(t5==t6);

	}

}
