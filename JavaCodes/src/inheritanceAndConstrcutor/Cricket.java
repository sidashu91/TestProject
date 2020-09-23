package inheritanceAndConstrcutor;

public class Cricket extends Game {
	
	
	
	String typeOfPlayer;
	public Cricket(String typeOfGAme,String typeOfPlayer) {
			
		super(typeOfGAme);
		this.typeOfPlayer= typeOfPlayer;
		
	}

	
	void printDetails()
	{
		System.out.println("Type of Game is :"+typeOfGame+ "\n"+ "Type of Player is :"+ typeOfPlayer+"\n");
	}
}
