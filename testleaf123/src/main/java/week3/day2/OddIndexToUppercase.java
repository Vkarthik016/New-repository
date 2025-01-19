package week3.day2;

import java.util.Iterator;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="changeme";
		char[] s1 = s.toCharArray();
		
		for (int i = 0; i < s1.length; i=i+2) {
			
			{
				//if(i%2==1)
				{
					System.out.print(s1[i]);	
					Character.toUpperCase(s1[i]);
				}

			
			
			
			
			
		}

	}

}
}
