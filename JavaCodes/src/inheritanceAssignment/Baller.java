package inheritanceAssignment;

public class Baller  extends Cricket{
	

		
		int noOfRuns;	
	    int noOfWickets;
		public Baller(String typeOfGAme,String typeOfPlayer, int noOfRuns, int noOfWickets) {
			
	        super(typeOfGAme, typeOfPlayer);
			this.noOfRuns= noOfRuns;
			this.noOfWickets= noOfWickets;
			
		}
		
		void printDetails()
		{
			System.out.println("Number of Runs: "+noOfRuns+"\n"+"Number of Wickets: "+noOfWickets+"\n"+"Type Of Game: "+typeOfGame+"\n"+"Type Of Player: "+typeOfPlayer+"\n");
		}
		
	}
	


