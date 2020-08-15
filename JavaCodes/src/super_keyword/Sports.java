package super_keyword;

public class Sports extends Marks {

	int score;
	
	public Sports(int rollNo, String name, int marks, int score) 
	{
		
		super(rollNo, name, marks);
		this.score = score;
		
		
		}
	
	
	void	display() 
	 {
		 
		 System.out.println(" "+ marks+"  "+rollNo+"  "+name+" "+ score);
	 } 
}
