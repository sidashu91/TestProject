package collectionframework;

public class Employee implements Comparable<Employee> {
	
	int empId;
	String name;
	double salary;
	
	
	public Employee(int empId, String name, double salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
//to String method represents the object
//to string method belongs to Object class

	
	public String toString() 
	{
		return empId + " "+name +" "+salary;
		
	}
	
	
	
	
	public  int compareTo(Employee e) 
	{
		if (this.empId > e.empId) {
			return 1;
		}
	    
		else if  (this.empId <e.empId) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	
	//----------------------> GOTO TEST CLASS
	
	
	
	
	
}
