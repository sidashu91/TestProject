package super_keyword;

public class Marks extends Student {

	
	int marks;
	
	public Marks(int rollNo, String name, int marks) {
		
		super(rollNo, name);// inherit Parent class constructor
		
		
		
		this.marks= marks;
		
	}
	
	
 
}
