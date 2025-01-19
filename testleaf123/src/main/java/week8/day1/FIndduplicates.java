package week8.day1;

import java.util.Arrays;

public class FIndduplicates {
	
	public void duplicate()
	{
		int[]num ={1,3,8,3,11,5,6,4,7,6,7};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]);
			}
		}
	}
	

}
