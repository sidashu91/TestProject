package superKeyword_HeirarichicalConstructor;

public class Marks extends Student {
	
	
	 int marks;
	 Marks(int rollNo, String name,int marks) {
		
		super(rollNo, name);
		this.marks= marks;
	}
	
	 void display () 
	 {
		 System.out.println(rollNo +" "+name+ "  "+marks);
	 }

}
