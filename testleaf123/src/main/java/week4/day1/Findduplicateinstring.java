package week4.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Findduplicateinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="google";
		
		char[]ch=str.toCharArray();
		
		Set<Character> set1 = new TreeSet<Character>();
		//List<Character> set2 = new ArrayList<Character>(set1);
		
		for(int i=0;i<ch.length;i++)
		{
			set1.add(ch[i]);
			
		}
		System.out.println(set1);
		
		
		for (Character i : ch) {
			
			set1.add(i);
		}
		System.out.println(set1);
//		Character character = set2.get(1);
//		System.out.println(character);
		

	}

}
