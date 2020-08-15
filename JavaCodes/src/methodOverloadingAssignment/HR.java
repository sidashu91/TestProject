package methodOverloadingAssignment;

public class HR extends Employee{
	
	int noOfrecruitments;
	
	HR(int empId, String name, double salary, int noOfrecruitments)
	{
		super(empId, name, salary);
		
		this.noOfrecruitments= noOfrecruitments;
	}

	
	double calSal (double incentives)
	{
		super.displayEmployeeDetails();
		super.salary = salary + incentives;
	    return salary;
	}
	
}
