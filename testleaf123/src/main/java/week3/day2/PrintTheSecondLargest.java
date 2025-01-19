package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintTheSecondLargest {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1[] = {3, 2, 11, 4, 6, 7};
//		Arrays.sort(num1);
//		
//		for (int i = num1.length-1; i >=0 ; i--) {
//			for (int j = 0; j < num1.length; j++) {
//				if(num1[i]>num1[j])
//				{
//					i=j;
//				}
//				
//			}
//			
//			
//				}
		
		ArrayList<Integer> num1=new ArrayList<Integer>();
		num1.add(3);
		num1.add(2);
		num1.add(11);
		num1.add(4);
		num1.add(6);
		num1.add(7);
		num1.add(10);
		Collections.sort(num1);
		//System.out.println(num1);
		//System.out.println("6 index"+num1.indexOf(6));
		for (int i = num1.size()-1; i >=0 ; i--) {
			System.out.print("second largest number is:"+ num1.get(i-1));	
			//System.out.println(num1.get(i));
			break;
			
			
			
		}
		
				
			}
			
		
		}

	

