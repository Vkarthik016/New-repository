package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class Findthemedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {1,3};
		int[] num2= {2};
		
		List<Integer> num3 =new ArrayList<Integer>();
		List<Integer> num4 =new ArrayList<Integer>();
		List<Integer> num5 =new ArrayList<Integer>();
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length;j++) {
				num3.add(num1[i]);
				num4.add(num2[j]);
				num5.addAll(num3);
				
				//num5.addAll(num4);
				
				//break;
				
			}
			
		}
		System.out.println(num3);
		System.out.println(num4);
		System.out.println((num5));
		 
		

	}

}
