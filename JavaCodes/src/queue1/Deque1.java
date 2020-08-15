package queue1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque1

{

	
	public static void main(String[] args) 
	{
		
		ArrayDeque<Integer> pq= new ArrayDeque<>();
		pq.offer(1001);
		pq.offer(2001);
		pq.offer(222);
		System.out.println(pq);
		
		pq.offerFirst(9999);
		System.out.println(pq);
		
		
	     pq.offerLast(5000);
	     System.out.println(pq);
		
	     pq.pollFirst();
	     System.out.println(pq);
	     
	     pq.pollLast();
	     System.out.println(pq);
	     
	     
	     System.out.println("Print the element at first "+ pq.getFirst());
	     System.out.println("Print the Element at last "+ pq.getLast());
	     
 Iterator<Integer> itr = pq.iterator();
 
    while (itr.hasNext()) {

	 System.out.println(itr.next());
}
    
    Iterator<Integer> itr1 = pq.descendingIterator();

    while (itr1.hasNext()) {

	 System.out.println(itr1.next());
}
 
 
 	     
	     
	}
}
