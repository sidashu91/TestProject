package methodOverloadingAssignment;

public class Manager  extends Employee{
	int noOfProjects;
	
	
	 Manager(int empId, String name, double salary, int noOfProjects) 
	
	{
		super(empId, name, salary);
		this.noOfProjects= noOfProjects;
  	}
	
	 //Override Parent class method
	 double calSal (double bonus)
		{
	        super.displayEmployeeDetails();
			super.salary = salary + (noOfProjects* bonus);
		    return salary;
		}

}
