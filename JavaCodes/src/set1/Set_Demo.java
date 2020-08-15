package set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;




public class Set_Demo {

	
	public static void main(String[] args) {
		
		
		//Random Order 
		
		Set<Integer> hs = new HashSet<Integer>();		
		hs.add(101);
		hs.add(201);
		hs.add(101);
		hs.add(222);
		hs.add(1111);
		hs.add(11110000);
		hs.add(1111);
		System.out.println("Hash Set"+hs);
		
		
		//Insertion Order
		Set<Integer> linkhs= new LinkedHashSet<Integer>();
		linkhs.add(101);
		linkhs.add(201);
		linkhs.add(101);
		linkhs.add(222);
		linkhs.add(1111);
		linkhs.add(11110000);
		linkhs.add(1111);
		
		System.out.println("LinkedHAshSet"+linkhs);
		
		
		
		//Sorted : In Ascending Order by default
		Set<Integer > treeSt= new TreeSet<>();
		treeSt.add(101);
		treeSt.add(201);
		treeSt.add(101);
		treeSt.add(222);
		treeSt.add(1111);
		treeSt.add(11);
		treeSt.add(11110000);
		treeSt.add(1111);
		System.out.println("Tree Set "+treeSt);
		
		
		
		//Merge the Two Sets:
		
		//linkhs.addAll(treest);
		
		linkhs.addAll(treeSt);
		
		
		System.out.println("Linked Hash Set + Tree Set "+linkhs);
		
		
		linkhs.retainAll(hs);
		System.out.println("Retain All linked hash set and hash set : "+ linkhs);
		
		
		linkhs.remove(222);// Remove my Value 
		System.out.println("Remove 222 from linked hash set "+linkhs);
		
		
		System.out.println("Size of set "+linkhs.size());
		System.out.println("To check element is present or not: "+linkhs.contains(2));
		
		//linkhs.clear();
		//System.out.println(linkhs);
		
		
		//*****************ITERATOR ********************************//
		//Applicable for list Set Queue Map
		
		Iterator<Integer> itr = treeSt.iterator();
		while (itr.hasNext())
		{
			
			System.out.println(itr.next());
			
		}
		
		
		
		
		
		
	}
}
