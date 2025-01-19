package collections;

import java.util.Iterator;



public class Stringoperations {

	public void reversethewordswithdot()
	{
		String S = "i.like.this.program.very.much";
		String[]splitwords=	S.split(".");
		for(int i=splitwords.length-1;i>=0;i++)
		{
			System.out.println(splitwords[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stringoperations s4=  new Stringoperations();
		//s4.reversethewordswithdot();

		String s = "Pavi";
		System.out.println(s.charAt(2));

		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}

		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

		int n=123;
		String.valueOf(n);
		System.out.println(n);

		String s2="i love pavi";

		//charat
		System.out.println(s.charAt(2));
		//lenght
		System.out.println(s.length());
		//equals
		System.out.println(s.equals("equals"+"karthik"));
		//equals ignore case
		System.out.println(s.equalsIgnoreCase("equals ignore case"+"PAVI"));
		//conains
		System.out.println(s.contains("contains" +'p'));
		//trim
		System.out.println(s.trim());
		//split
		String[]	split =s2.split(" ");
		for(String string: split)
		{
			System.out.println(string);
		}
		//isempty
		System.out.println(s.isEmpty());
		//indexof
		System.out.println(s.indexOf("a"));

		//replace
		System.out.println(s2.replace("i", "k"));
		System.out.println(s2.replace("pavi", "Karthik"));

		//uppercase
		System.out.println(s2.toUpperCase());

		//join
		System.out.println(s2.join("/", "2","11","1996"));	

		//concat
		System.out.println(s.concat(s2));

		//joins
		String fruits =String.join("=","karthik","pavi");
		System.out.println(fruits);

		//trim remove white spaces
		String name="   hay   ";
		System.out.println(name);
		System.out.println(name.trim());

		//contains
		System.out.println(name.contains("h"));

		//substring return the character till the second position
		String	name1 ="am karthik";
		System.out.println(name1.substring(1,7));

		//parseint convert string to integer
		int a=	Integer.parseInt("123");
		System.out.println(a);

		//value of or tostring method
		int b=123;
		String num=	String.valueOf(b);
		System.out.println(num);






	}

}
