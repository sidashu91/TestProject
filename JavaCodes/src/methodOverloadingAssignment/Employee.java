package methodOverloadingAssignment;

public class Employee {

	int empId;
	String name;
	double salary;
	
	Employee (int empId, String name, double salary)
	{
		this.empId= empId;
		this.name= name;
		this.salary= salary;
	}
	
	
	void displayEmployeeDetails()
	{
		System.out.println("Employee ID : "+empId+"\n"+"Name of Employee : "+name+"\n"+"Slary Of Employee"+ salary);
	}
	
	double calSal (double allowance)
	{
		
		this.salary = salary + allowance;
	    return salary;
	}
	
	
	
}
