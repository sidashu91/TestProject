package queue1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue1 {
	
	public static void main(String[] args) 
	{
		
	PriorityQueue<Integer> pq =new PriorityQueue<>();
	
	pq.add(200);
	pq.add(222);
	pq.add(211);
	pq.add(1211);
		
	System.out.println(pq);
	pq.offer(10);	
	System.out.println(pq);
	
	pq.add(345);
	System.out.println(pq);
	
	
	pq.add(52);// adds in random place within th equeue
	System.out.println(pq);
	
	
	pq.clear();
	System.out.println(pq);
	
	// pq.remove(); //THROWS EXCEPTION after clear_______________________________________
	// System.out.println();
		
	
	pq.poll();//**GIVES EMPLTY BRACES after clear______________________________
	System.out.println(pq);
	
	pq.add(100);
	pq.add(50000);
	pq.add(54);
	pq.add(78);
	pq.add(200);
	pq.add(987);
	pq.add(85);
	pq.add(100);
	pq.add(100);
	
	System.out.println(pq);
	
	 
    pq.poll();//removes from first
    System.out.println(pq);
    
    
   System.out.println("Peek Prints the head Element" + pq.peek());
   System.out.println("To check if the queue is emplty"+ pq.isEmpty());
   System.out.println(" Size of the Queue"+ pq.size());
   
   
   Iterator <Integer> itr = pq.iterator();
   while (itr.hasNext()) {
	System.out.println(itr.next());
	
}
    
    
   
	
	
	}

}
