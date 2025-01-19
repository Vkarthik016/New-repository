package collections;

public class Statickeyword {
	
	static int a=10;
	int b=a+20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Statickeyword a1 = new Statickeyword();
		Statickeyword a2 = new Statickeyword();
		System.out.println(a1.a++);
//		System.out.println(a1.b++);
	System.out.println(a2.a++);
//		System.out.println(a2.b++);
		
		System.out.println(a1.b);

	}

}
