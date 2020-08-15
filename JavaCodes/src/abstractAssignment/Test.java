package abstractAssignment;

public class Test {
	
	public static void main(String[] args)
	{
		
		Shape s = new Circle();
		
		System.out.println("Area of the Circle"+s.area());
		System.out.println("Per of the Circle "+ s.peri()+"\n"+"********************************");
		
		Shape r= new Rectangle();
		
		System.out.println("Area of the Rectangle: "+r.area());
		System.out.println("Per of the Rectangle: "+ r.peri()+"\n"+"********************************");
		
		
		
	}

}
