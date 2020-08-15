package heirarchicalInheritance;

public class Test {

	
	public static void main(String[] args) {
		
		
		
		Student student = new Student();
		student.inputPerson();
		student.inputStudent();
		student.displayStudent();
		
		Employee employee = new Employee();
		employee.inputPerson();
		employee.inputEmployee();
		employee.displayEmployee();
		
	}
}
