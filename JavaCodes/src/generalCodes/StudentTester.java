package generalCodes;

public class StudentTester{
	   
	  private  int studentId;
	  private String name;
	  private float qualifyingExamMarks;
	  private char residentialStatus;
	  private int yearOfEngg;
	
	  
	
	   public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}



	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}



	public char getResidentialStatus() {
		return residentialStatus;
	}



	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}



	public int getYearOfEngg() {
		return yearOfEngg;
	}



	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}



	public static void main(String[] args){
		   
		StudentTester s = new StudentTester();
		s.setName("Jacob");  
		s.setQualifyingExamMarks(80);
		s.setResidentialStatus('H');
		s.setStudentId(1001);
		s.setYearOfEngg(3);
		
		System.out.println("Student Name :"+s.getName()+"\n"+"Student Id :"+s.getStudentId()+"\n"+"Qualifying Marks :"+s.getQualifyingExamMarks()
		+"\n"+"Residential Status :"+s.getResidentialStatus()+"\n"+"Year Of Engineering : "+s.getYearOfEngg());
		   
	      //Create an object of Student class
	      //Use setter methods to set the values
	      //Use getter methods with proper escape sequences to display values
	   }
	}
