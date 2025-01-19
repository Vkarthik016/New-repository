package week1.day2;

import java.util.Arrays;

public class FindingMissingelementonarray {

	public static void main(String[] args) {
		int a[]= {6,1,2,8,3,4,7,10,5};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
			
		{
			if(a[i]!=i+1)
				
			{
				System.out.println(a[i]-1);
				break;
			}
		}
		
		

	}

}
