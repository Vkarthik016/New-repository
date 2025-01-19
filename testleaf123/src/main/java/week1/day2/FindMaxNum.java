package week1.day2;

import java.util.Arrays;

public class FindMaxNum {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int max1,max2;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			for(int j=1;j<a.length;j++)
			{
				
				if(a[i]<a[j])
					
				{
					System.out.println(a[i]);
					break;
				}
			}
		}

	}

}
