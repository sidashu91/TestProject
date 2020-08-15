package methodOverriding;

public class Test {

	
	public static void main(String[] args) {
		
		
		Fruit f1 = new Fruit();
		f1.eat(2145);
		
		Apple a = new Apple();
		a.eat(5);
		

		
		//Dynamic dispatch
		Fruit f = new Apple();
	     f.eat(8);
		//
		
	}
}
