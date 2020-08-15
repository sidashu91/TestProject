package set1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;





public class TestPerson {

	
	public static void main(String[] args) {
		
		
		Person p1 = new Person(50, 999999999);
		Person p2 = new Person(15, 888888888);
		Person p3 = new Person(65, 999998888); 
		
		
		
		Set<Person> ls = new LinkedHashSet<>();
		
		ls.add(p1);
		ls.add(p2);
		ls.add(p3);
		
		Iterator<Person> itr = ls.iterator();
        while (itr.hasNext()) 
        {
		System.out.println(itr.next());
			
		}
        
       //**************Tree Set for Sorting ***************
        //Should  have to use Comparable and CompalreTo method
        SortedSet<Person> ts = new TreeSet<>();
        ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		
		Iterator <Person> itr2 = ts.iterator();
		 while (itr2.hasNext()) 
	        {
			System.out.println(itr2.next());
				
			}
	        
        
		
		
	}
}
