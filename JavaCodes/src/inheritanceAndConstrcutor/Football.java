package inheritanceAndConstrcutor;

public class Football extends Game {

	
	
	String playerName;
	int noOfgoals;
	
	 Football (String typeOfGAme ,String playerName, int noOfgoals ) {
	   
		super(typeOfGAme);
		this.noOfgoals= noOfgoals;
		this.playerName= playerName;
		
			
	}
	 
	 void prinDetails()
	 {
		 System.out.println("Type Of Game: "+typeOfGame+"\n"+ "Number of Goals are :"+noOfgoals+"\n"+"Player Name: "+playerName+"\n");
	 }	 
	 
}
