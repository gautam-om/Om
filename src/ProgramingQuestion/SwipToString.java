package ProgramingQuestion;

public class SwipToString {

	public static void main(String[] args) {

		String a = "one";
		String b = "two";

		a = a + b;
		 
		System.out.println(b);
		a = a.substring(b.length());

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
