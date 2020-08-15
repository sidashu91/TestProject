package interface_Assignments;

public class Circle extends Diameter implements  Circumference
{

	@Override
	public float circum(float radius) {
		
	  float circumference =  (2 *3.14f * radius);
		
		return circumference;
	}

	@Override
	public float area(float radius) {
		float  area =  (3.14f* radius * radius);
		return area;
	}

	@Override
	float diameter(float radius) {
	float diameter=	 (2* 3.14f* radius);
		return diameter;
	}

	
}
