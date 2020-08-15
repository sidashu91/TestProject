package basicscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());		
		Thread.sleep(2000);
		
		List<WebElement> totrows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));		
		System.out.println("Total Rows in table:   "+totrows.size());
		
		List<WebElement> totcols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));		
		System.out.println("Total Cols in table:   "+totcols.size());
		
		List<WebElement> fc = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));		
		List<WebElement> fourthcol = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
				
		for(int i=0; i< totrows.size();i++)
		{
			System.out.println("Company Name:   "+fc.get(i).getText());
			System.out.println("Current Price:   "+fourthcol.get(i).getText());
			System.out.println("-----------------------------------");
			
			String compname = fc.get(i).getText();			
			if(compname.equalsIgnoreCase("Tata Motors Ltd."))
			{
				String currentprice = fourthcol.get(i).getText();				
				float intcp = Float.parseFloat(currentprice); 		
				if(intcp > 100)
				{
					System.out.println("Match Found!!!!");
					fc.get(i).click();
					break;
				}
			}
		}		
		/*
		 * 
		 * table 
//table[@class='dataTable']

body
//table[@class='dataTable']/tbody

total rows
//table[@class='dataTable']/tbody/tr

specific row
//table[@class='dataTable']/tbody/tr[1]

totl cols
//table[@class='dataTable']/tbody/tr[1]/td

specific cols
//table[@class='dataTable']/tbody/tr/td[4]

specific cell
//table[@class='dataTable']/tbody/tr[1]/td[3]

all cells
//table[@class='dataTable']/tbody/tr/td
		 * */
		 
		
		
		

	}

}
