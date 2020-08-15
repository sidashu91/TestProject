package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;



public class Test {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(16, "Sid", 9000);
		Employee e2 = new Employee(108, "XYZ", 8000);
		Employee e3 = new Employee(103, "Ayush", 2000);
		
		
		//System.out.println(e1+"\n"+e2+"\n"+e3);
		
		
		//Create an Array List and make it generic to Employee Class
		ArrayList<Employee> list1 = new ArrayList<>();
		
		
		//Add objects to Array list
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
		
		//Traverse using List Iterator
		Collections.sort(list1);
		
		ListIterator<Employee> itr = list1.listIterator();
		while (itr.hasNext()) {
		/*
		 * 
		 * --------LONG METHDO WHEN WE DO NOT USE toSring METHOD---------
		 Employee e = itr.next();
		 System.out.println(e.empId+" "+e.name+" "+e.salary);
		
		*/ 
			
		System.out.println(itr.next());  // toString Method Used
		}
		
	
//		while (itr.hasPrevious()) {
//			
//			
//			System.out.println(itr.previous());
//			}
//		
//		list1.remove(0);
//	   System.out.println(list1);
	
	
	
	
	
		
	}
}
