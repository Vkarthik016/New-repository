package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Karthik");
		hs.add("pavi");
		hs.add("saras");
		hs.add("saras");
		//hs.add(null);
		System.out.println(hs);
		
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			
			TreeSet<String> ts= new TreeSet<String>();
			ts.addAll(hs);
			System.out.println(ts);
			Iterator itr = ts.descendingIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next()); 
			
			}
			
			
		}

	}

}
