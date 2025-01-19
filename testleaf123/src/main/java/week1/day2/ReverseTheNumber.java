package week1.day2;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num[]= {321};
		String value =num.toString();
		System.out.println(value);
		for(int i=0;i<value.length();i++)
		{
		char[] rev= value.toCharArray();
		
		for(int j=rev.length-1;j>=0;j--)
		
		{
		System.out.println(rev[j]);
			
		}
		
//		
//		String[] split1 = value1.split(" ");
//		//for(int i=0;i<value1.length()-1;i++)
//		{
//		//	System.out.println(split1[i]);
//		}
//		
//		String num3="242525";
//		System.out.println(Integer.parseInt(num3));
//
//		
	}
}
}
