package exception_Handling;

public class Student {
	
	void validMarks(int marks) throws MarksOutOfBound
	{
		if (marks>100) 
		{
			throw new MarksOutOfBound("Invalid Marks");
			//System.out.println("Invalid Marks");
		}
	}

	
	public static void main(String[] args) 
	{
	
		Student s = new Student();
		try {
			s.validMarks(102);// Always Handle your Exception by calling your methods
		} catch (MarksOutOfBound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
