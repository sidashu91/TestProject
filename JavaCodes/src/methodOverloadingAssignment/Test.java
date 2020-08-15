package methodOverloadingAssignment;

public class Test {

	
	public static void main(String[] args) {
		
		Employee e= new Employee(101, "Sidd",1000);		
		e.displayEmployeeDetails();
		System.out.println("Total Salary is "+e.calSal(500)+"\n"+"***************************");
		
		
		//Dynamic Dispatch Manager
		Employee manager = new Manager(102, "Siddharth", 8000, 300);		
		System.out.println("Total Salary of the Manager "+manager.calSal(500)+"\n"+"***************************");
		
		
		//dynamic Dispatch HR
		
		Employee hr= new HR(103, "Ayush", 9000, 3);
		
		//HR hr1= new HR(103, "Ayush", 6000, 5);
		
		System.out.println("Salary of HR : "+hr.calSal(5000)+"\n"+"***************************");
		
	}
}
