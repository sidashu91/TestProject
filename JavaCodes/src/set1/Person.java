package set1;



public class Person  implements Comparable <Person>
{

	int age;
	long contactNo;
	
	
	public Person(int age, long contactNo) 
	{
		
		this.age = age;
		this.contactNo = contactNo;
	}
	
	
	
	public String toString() 
	
	{
		return age +" "+contactNo+" ";
	}
	
		
	
	public  int compareTo(Person p) ///Implemented only for Sorted Set
	{
		if (this.age > p.age) {
			return 1;
		}
	    
		else if  (this.age <p.age) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
		
	
	
	

	
	
	
	
	}
	}
