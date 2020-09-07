package dataPRoviders;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TestDataFile {
	
	@DataProvider(name="data")
   public static Object[][]	testdata (Method m)
	{  
		Object[][]  obj= null;	  
		    
		 if(m.getName().equals("registerUser")) 
		 {
			  obj= new Object[4][4];
			 
			    obj[0][0]="Siddharth";
				obj[0][1]="Chaturvedi";
				obj[0][2]="siddhartha.chaturvedi91@gmail.com";
				obj[0][3]="0001";	
								
				
				obj[1][0]="Ashok";
				obj[1][1]="Chaturvedi";
				obj[1][2]="akchat321@gmail.com";
				obj[1][3]="0002";
				
				obj[2][0]="Sarla";
				obj[2][1]="Chaturvedi";
				obj[2][2]="sarla100@gmail.com";
				obj[2][3]="0003";
				
				
				obj[3][0]="Ayush";
				obj[3][1]="Chaturvedi";
				obj[3][2]="Ayush@gmail.com";
				obj[3][3]="0004";
				// return obj;
				
		 } 
		
         if(m.getName().equals("LoginUser")) 
         {
        	 obj= new Object[2][2];
        	 
        	 obj[0][0]="Siddharth";
			 obj[0][1]="Chaturvedi";
			 
			 
			 obj[1][0]="Ashok";
			 obj[1][1]="Chaturvedi";
			//  return obj;
		 }
         return obj;
       
		 
				
		
	}

}
