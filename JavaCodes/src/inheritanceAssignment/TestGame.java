package inheritanceAssignment;



public class TestGame {
	
	public static void main(String[] args) {
		
		
	
		
		Football football = new Football("Football", "Ronaldo", 2);
		Cricket cricket = new Cricket("Cricket", "Cricket Player");
		Batsman  batsman = new Batsman("Cricket", "BatsMan", 10, 5);
		Baller   baller = new Baller("Cricket","Baller" ,20, 10);
		
		
		cricket.printDetails();
		football.prinDetails();
		batsman.printDetails();
		baller.printDetails();
		
	}

}
