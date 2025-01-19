package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Findsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="abcabcababcabcababc";
		String[] split1 = str.split("ab");
		
		int length1 = str.length();
		System.out.println("KKKKKKKK"+length1);
		List<String> split2 = new ArrayList<String>();
		
		
		
		
		System.out.println("?????????"+split1.length);
		
		for (int i = 0; i < split1.length; i++) {
			split2.add(split1[i]);
			//System.out.println(">>>>>>>"+split2);
			
		}
		
		System.out.println("string"+split2.toString());
		
		System.out.println(split2);
		
		int size = split2.size();
		int proper_size = size-1;
		
		System.out.println(proper_size);
		
		int size2 =length1-proper_size;
		System.out.println(size2);
		}
		
	
}
