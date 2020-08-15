package superKeyword_HeirarichicalConstructor;

public class Sports extends Student{
	
	int score ;

	public Sports(int rollNo, String name, int score) {
		
		
		super(rollNo, name);
		
		this.score= score;
	}
	
	
	void display () 
	{
		System.out.println(" "+rollNo +" "+ name +"  "+ "  "+score);
	}
	
	
}
