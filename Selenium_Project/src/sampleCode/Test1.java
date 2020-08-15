package sampleCode;




import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 extends Base{
	
	
	@BeforeSuite //Initialize driver and adds implicit wait of 5 seconds
	public void initialize() throws IOException {
		driver = initializeDriver();
	}
	
	@BeforeGroups
	public void navigatePracticePage() throws IOException {
		navigatePractice();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.sampleCode.com"); //Hard Assert
	}
	
	@Test
	public void checkLogin() throws IOException {
		ExcelData d= new ExcelData();	//Excel data fetching code file
		TestPageObjects PO = new TestPageObjects(driver); //Page object model file
		
		SoftAssert softAssert = new SoftAssert();
		
		WebElement user = PO.getUsername();
		WebElement pass = PO.getPassword();
		WebElement submit = PO.getSubmit();
		
		
	    user.sendKeys(d.getData("username"));	//Getting username input field and sending correct username string
		pass.sendKeys(d.getData("password"));	//Getting password input field and sending correct password string
		submit.click();	//Clicking submit button
		
		softAssert.assertEquals(driver.getTitle(),"Home"); //Soft Assert
		softAssert.assertAll();
		
	}
	
	@Test
	public void checkDropdown() {
		TestPageObjects PO = new TestPageObjects(driver); //Page object model file
		
		WebElement dropDown = PO.getDropdown();
		WebElement go = PO.getGoButton();
		
		Select s = new Select(dropDown);
		s.selectByValue("10");
		go.click();
		String alertText = driver.switchTo().alert().getText();
		Assert.assertEquals(alertText,"Access restricted to minors");
		
	}
}