package maps1;


import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) 
	{
		Employee1 emp1 = new Employee1(101, "Ayush", 60000);
		Employee1 emp2 = new Employee1(102, "Sid", 80000);
		Employee1 emp3 = new Employee1(103, "xyz", 50000);
		Employee1 emp4 = new Employee1(104, "xyz", 50000);
		
		LinkedHashMap<Integer, Employee1> lhm = new LinkedHashMap<>();
		lhm.put(1111, emp1);
		lhm.put(222, emp2);
		lhm.put(333, emp3);
		lhm.put(444, emp4);
		System.out.println(lhm);
		
/*		//************Else make EmpNo as key************
		System.out.println("*************************Using Emp Number as Key *****************");
		
		//Have to remove the empNo from the toString
		lhm.put(emp1.empNo, emp1);
		lhm.put(emp2.empNo, emp2);
		lhm.put(emp3.empNo, emp3);
		lhm.put(emp4.empNo, emp4);
		System.out.println(lhm);
		*/
		
		/* key as name
		Have to remove the name from the toString
		lhm.put(emp1.name, emp1);
		lhm.put(emp2.name, emp2);
		lhm.put(emp3.name, emp3);
		lhm.put(emp4.name, emp4);
		System.out.println(lhm); 
		 */
		
		
		
		
		for(Map.Entry<Integer, Employee1> e : lhm.entrySet()) 
		{
			System.out.println(e.getKey()+" ---->"+e.getValue());
		}
	}
	
	
	
	
}
