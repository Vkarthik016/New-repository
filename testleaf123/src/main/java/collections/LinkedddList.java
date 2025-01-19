package collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedddList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("red");
		ll.add("blue");
		ll.add("green");
		ll.add("green");
		for(int i=1;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		//4 reverse order
		for(int i=ll.size()-1;i>=0;i--)
		{
			System.out.println("reverse order" + ll.get(i));
		}
		
		//reverse the linkedlist using iterator
		Iterator descendingIterator = ll.descendingIterator();
		while(descendingIterator.hasNext()) {
			System.out.println("iterator"+descendingIterator.next());
		}
		
		//iterate forward
		Iterator  iterator1= ll.iterator();
		while(iterator1.hasNext()) {
			System.out.println("fwd"+iterator1.next());
		}
		
		//5 insert element in specified position
		ll.add(4, "yellow");
		System.out.println(ll);
		
		//6 replace an element
		ll.set(0, null);
		ll.set(1, null);
		System.out.println(ll);
		ll.offerFirst("pink");
		System.out.println(ll);
		ll.addLast("orange");
		System.out.println(ll);
		
		//first and last occurance
		System.out.println(ll.lastIndexOf("orange"));
		
		//
		
		
		
		
		
		
		
		
		

	}

}
