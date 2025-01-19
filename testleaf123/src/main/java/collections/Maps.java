package collections;

import java.util.Collections;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "karthik");
		hm.put(null, null);
		hm.put(null,"saras");
		//System.out.println(hm);
		
	   System.out.println(hm.entrySet());
	   
	   for(int i=0;i<=hm.size();i++)
	   {
		   System.out.println(hm.get(i));
	   }
	   
	   String s="Karthik";
	   char[] charArray = s.toCharArray();
//	   for(int i=0;i<=charArray.length-1;i++)
//	   {
//		   System.out.println(charArray[i]);
//	   }
	   
	   for(int i=charArray.length;i<=0;i--)
	   {
		   System.out.println("reverse" +charArray[i]);
	   }
	   

	}

}
