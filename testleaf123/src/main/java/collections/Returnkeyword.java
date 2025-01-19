package collections;

public class Returnkeyword {

	public int sum(int a,int b)
	{
		int c;
		return c=a+b;
	}
	
	public String getname()
	{
	 return "Karthik";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Returnkeyword rk = new Returnkeyword();

		int c1=	rk.sum(10, 20);
		System.out.println(c1);
		
		String name = rk.getname();
		System.out.println(name);

	}

}
