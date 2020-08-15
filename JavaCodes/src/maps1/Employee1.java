package maps1;

public class Employee1 {
	
	
	int empNo;
	String name;
	double salary;
	
	public Employee1(int empNo, String name, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		
	}
	
	

	public String toString() 
	{
		return empNo+ " "+name +" "+salary;
		
	}
	
	
/*	public String toString() 
	{
		return name +" "+salary;
		
	}

*/	

}
