package web_tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterate_Dynamic_Webtable 


{
	
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "D:\\Java\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();	
	
	//Size of  the Column:--
	
	 List<WebElement> colist = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
	 int colSize = colist.size();
	 System.out.println("Number of Columns are : "+colSize);
      

	 List<WebElement> rowlist = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
	 int rowSize = rowlist.size();
	 System.out.println("Number of Rows are : "+rowSize);
       
	 String before="//*[@id='leftcontainer']/table/tbody/tr[";
	 String middle = "]/td[";
	 String after = "]";
	 
	 int colCount=0;
	   for (int j = 1; j <=colist.size(); j++)
		//for (int i = 1; i <=rowlist.size(); i++)
		 {
		
		   
		   String colName= colist.get(colCount).getText();
		   System.out.println("*****ColumNumber: "+j+" ********Column Name: "+colName+"*****");	
			for (int i = 1; i <=rowlist.size(); i++)
			//for (int j = 1; j <=colist.size(); j++) 
			 {			
							
							WebElement element=	 driver.findElement(By.xpath(before+i+middle+j+after));
							System.out.println(element.getText());
									
		     }
			
			colCount++;
					 
		 }
	   
	   
	
	 
	 
}
}


