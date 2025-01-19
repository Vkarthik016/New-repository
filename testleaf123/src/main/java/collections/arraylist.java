package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist {
	
	public void araaylist()
	{
		List<String> colors= new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("white");
		System.out.println(colors);
		
		for(String color1: colors) {
			System.out.println(color1);
		}
		
		for(int i=0;i<colors.size();i++)
		{
			System.out.println(colors.get(i));
		}
		
		for(int i=colors.size()-1;i>=0;i--)
		{
			System.out.println("reverse"+ colors.get(i));
		}
		
		colors.add(0, "black");
		System.out.println(colors);
		
		System.out.println("3rd position" + colors.get(3));
		
		colors.remove(3);
		System.out.println("after removal"+colors);
		
		if(colors.contains("black"))
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not found");
		}
		//8
		Collections.sort(colors);
		System.out.println("after sorting"+ colors);
		
		//9
		List<String> newlist = new ArrayList<String>();
		newlist.addAll(colors);
		System.out.println("newlist"+ newlist);
		
		//11
		Collections.reverse(colors);
		System.out.println("reverse"+ colors);
		
		//12 sublist
		System.out.println(colors.subList(0, 2));
		
		//13 compare two arraylist
		System.out.println(colors.equals(newlist));
		
		//14 swap two elements
		Collections.swap(colors, 0, 1);
		System.out.println("swapping" + colors);
		
		//17 empty an array list
		System.out.println(colors);
		
		//18 is empty or not
		System.out.println("is empty"+colors.isEmpty());
		
		//19 replace new color
		colors.set(0, "orange");
		System.out.println(colors);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylist al= new arraylist();
		al.araaylist();

	}

}
