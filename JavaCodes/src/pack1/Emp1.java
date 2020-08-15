package pack1;

public class Emp1 {

	private int rollNo;
	private String name;
	private double salary;
	
	
public void setRollNo(int rollNo) {
		
		if  (rollNo>100) 
		{
			this.rollNo = rollNo;
		}
		
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	
//	public static void main(String[] args) {
//		
//		Emp1 e = new Emp1();
//		e.setRollNo(10000);
//		System.out.println(e.getRollNo());
	//}



	public void setSalary(double salary) {
		
		if (salary !=10000) 
		{   
			System.out.println("Salry is Valid");
			this.salary = salary;
			
			
		}
		else {
			System.out.println("Salary is Invalid");
		}
		
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	
	
}
