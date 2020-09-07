package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginparameters
{
	
	@Test(dataProvider="getData")
	public void Login(String uname, String pwd, String upref, String accntno)
	{
		System.out.println("Data Provider for Login is completed");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][4];
				
		//1st Row
		data[0][0]="username1";
		data[0][1]="password1";
		data[0][2]="user pref";
		data[0][3]="Account No1";
				
		//2nd Row
		data[1][0]="username2";
		data[1][1]="password2";
		data[1][2]="user pref";
		data[1][3]="Account No2";
		
		//3rd Row
		data[2][0]="username3";
		data[2][1]="password3";
		data[2][2]="user pref";
		data[2][3]="Account No3";
		return data;			
		
	}
	

}
