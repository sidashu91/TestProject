package myCodes;



import java.sql.*;

public class Methods {

	public static void main(String[] args) {
		
		try {
			
			//get connection to DB 
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Ramji@456");
			
			//create statement
			Statement stmnt = myConn.createStatement();
			
			ResultSet myRest= stmnt.executeQuery("select * from sys_config");
		
			
			
			while(myRest.next()) {
		        String Name = myRest.getString("country");
		        //System.out.print(i);
		       // System.out.println("Name:"+Name);
		    }
		} catch (Exception e) {
			System.out.println("Error"+e);
			
			
			//e.printStackTrace();
		}
		
		
		
	}
	
	
	
	}
                   




