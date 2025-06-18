package sample;

public class SingletonClass {
	
	//Singleton class :- A class which allowed us to create only one object is called Signleton class
	
	static SingletonClass  st = new SingletonClass();
	 
	 private SingletonClass()
	{
	   System.out.println("Construct will invoke for only one object");
	}
	 static SingletonClass getInstance()
	 {
	   return st;
	 }

	public static void main(String[] args) {
		
		SingletonClass sc = SingletonClass.getInstance();

	}

}
