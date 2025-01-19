package collections;

public class SecondClass {

	
//	  SecondClass() 
//	  {
//		  System.out.println("am normal");
//	  }
//	 
//	SecondClass(String s) {
//		System.out.println("am argument" + s);
//	}
	
	String name;
	
	public void dummymethod()
	{
		System.out.println("am method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecondClass sc = new SecondClass();
		System.out.println(sc.name);
		sc.dummymethod();

	}

}
