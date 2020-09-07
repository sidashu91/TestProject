package redifftestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginCred extends LoginTest
{
	//Initialize/declarations

	//public WebDriver driver;	
	//Properties prop1 = new Properties();
	//Logger applog = Logger.getLogger("devpinoyLogger");
	
	//@Test(priority=1,dependsOnMethods= {"redifftestcases.LoginTest.LaunchURL"})
	@Test(priority=2,dataProvider="getData",dependsOnMethods= {"LaunchURL"})
	public void EnterCred(String username, String password) throws IOException, InterruptedException
	{
		applog.debug("Starting the Test --> Entering User Cred");
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\config.properties");
		prop.load(fs);	
				
		System.out.println(driver.getTitle());
		driver.findElement(By.id(prop.getProperty("id_username"))).sendKeys(username);
		driver.findElement(By.id(prop.getProperty("id_password"))).sendKeys(password);
		
		driver.findElement(By.name(prop.getProperty("name_GOButton"))).click();		
		
		System.out.println(driver.getTitle());	
		
		if(driver.getTitle().contains("error"))
		{
			applog.debug("PASSED: Login Failed - Either Username and password is incorrect.");			
		}
		else
		{
			applog.debug("FAILED:Login Passed - User Logged in");	
			Assert.assertEquals(driver.getTitle(), "Rediffmail NG - Login error", "Error Occured - LogIn Failed");
		}
		
		driver.navigate().to(prop.getProperty("URL"));		
		applog.debug("Ending the Test --> Entering User Cred");
	}//Test Ends
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[4][2];
				
		//1st Row
		data[0][0]="username1";
		data[0][1]="password1";
		
		//2
		data[1][0]="username2";
		data[1][1]="password2";
		
		//3
		data[2][0]="username3";
		data[2][1]="password3";
		
		//4
		data[3][0]="username4";
		data[3][1]="password4";
				
		return data;			
		
	}
	
	
}
