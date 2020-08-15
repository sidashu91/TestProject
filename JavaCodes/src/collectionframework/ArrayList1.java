package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;





public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(101);
		list1.add(901);
		list1.add(201);
		list1.add(101);		
		System.out.println(list1);
		
		
		list1.add(1,88888);		
		System.out.println(list1); // adds and shifts
		
		
		//another list
		ArrayList<Integer> list2= new ArrayList<Integer>();
		
		list2.add(111111);
		list2.add(200);
		list2.add(2011);
		list2.add(99999);
		System.out.println(list2);
		
		System.out.println("After Merging of two  arraylist");
		list2.addAll(list1);
		System.out.println(list2);// list2 comes first
		
		System.out.println("After Merging of two  arraylist");
		list1.addAll(list2);
		System.out.println(list1);// list1 comes first
		
		//Remove list
		list1.remove(0);
		System.out.println(list1);//to remove element enter index
		
		System.out.println("To check whether element is present in the list :"+ list1.contains(201));
		System.out.println("To check the size of array list : "+ list1.size());
		
		System.out.println("To get the Data at particular Position "+ list1.get(1));
		
		//To Sort the data in ascending order 
		Collections.sort(list1);
		System.out.println(list1);
		
		//to sort data in descinding order 
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
        
        
    //    list1.clear(); //to empty the list
     //   System.out.println(list1);
        
        
       // -------------------List Iterator----------------------------------------------
        
        ListIterator<Integer> itr = list1.listIterator();
        System.out.println("Forward direction..");
            
        while (itr.hasNext())
        {
    		System.out.println(itr.next());
    			
	     }			
			
        while (itr.hasPrevious()) 
        {
			
        	System.out.println(itr.previous());
		}
        
		}
        
        
        
	}
	
	

