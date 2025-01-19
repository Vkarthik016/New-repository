package week4.day1;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class SetWithGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company ="google";
		
		char[]ch= company.toCharArray();
		Set<Character> ch1 = new TreeSet<Character>();
		Set<Character> ch2 = new TreeSet<Character>();
		
		for (int i = 0; i < ch.length; i++)
		{
			if(!ch1.add(ch[i]));
			{
				ch2.add(ch[i]);
			}
			
		}
		System.out.println(ch1);
		//System.out.println(ch2);

	}

}
