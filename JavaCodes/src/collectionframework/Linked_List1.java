package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List1 {

	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> llist = new LinkedList<>();
		
		llist.add(101);
		llist.add(201);
		llist.add(103);
		llist.add(104);
		
		
		System.out.println(llist);
		
		
		
		llist.addFirst(999999);
		System.out.println(llist);
		
		llist.addLast(8888888);
		System.out.println(llist);
		
		llist.add(0, 111110000);// insert element in a part position
		System.out.println(llist);
		
		
		
		ArrayList<Integer> llst2 = new ArrayList<>();
		llst2.add(1115451);
		llst2.add(9056480);
		llst2.add(845400);
		System.out.println(llst2);
		
		
		//to merger 
		
		
		llist.addAll(llst2);
		System.out.println(llist);
		
		
		
		
		llist.removeFirst();
		System.out.println(llist);
		
		llist.removeLast();
		System.out.println(llist);
		
		
		System.out.println("To Get the First Element of linked list"+llist.getFirst());
		System.out.println("To get the Lastelement of linked list:"+llist.getLast());
		
		System.out.println("To check the Size of array list "+ llist.size());
		System.out.println("To get element at particular position "+llist.get(4));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}