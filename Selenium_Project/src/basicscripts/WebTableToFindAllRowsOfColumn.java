package basicscripts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableToFindAllRowsOfColumn {
	WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		String url = "https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose";
		System.setProperty("webdriver.chrome.driver",
				"D:\\Java and Selenium\\Browser Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		String expected_ColumnName = "% Change";
		String xpath_column_Names_heading = "//*[@id='leftcontainer']/table/thead/tr/th";
		String xpath_NumberOfRows = "//*[@id='leftcontainer']/table/tbody/tr";
		String xpath_Col_first = "/td[";
		String xpath_Rowfirst = "//*[@id='leftcontainer']/table/tbody/tr[";
		String xpath_Second = "]";

		List<WebElement> list_of_ColNames = driver.findElements(By.xpath(xpath_column_Names_heading));
		List<WebElement> listofRow = driver.findElements(By.xpath(xpath_NumberOfRows));
		List<String> colNames = new ArrayList<>();
		List<String> valueOfExpectedCol = new ArrayList<>();
		// Iterate Over Size of the Columns Present in the Table
		for (int i = 0; i < list_of_ColNames.size(); i++) {
			// Add Columns Names to a list of Strings
			colNames.add(list_of_ColNames.get(i).getText());
			if (list_of_ColNames.get(i).getText().equals(expected_ColumnName)) {

				// Find Index of the Expected Column
				int indexOfReqCol = i + 1;
				System.out.println("Index of the Required Column is " + indexOfReqCol);
				// Iterate of over the Number of rows Present :
				for (int j = 0; j < listofRow.size(); j++) {
					int indexOfrequiredROw = j + 1;
					WebElement element = driver.findElement(By.xpath(xpath_Rowfirst + indexOfrequiredROw + xpath_Second
							+ xpath_Col_first + indexOfReqCol + xpath_Second));
					valueOfExpectedCol.add(element.getText());

				}
			}

		}

		System.out.println("*********Names Of all The Couums in the Table*********\n");
		for (String string : colNames) {
			System.out.print(string + "\t");
		}

		System.out.println("\n************Value Of Expected Coumlumn " + expected_ColumnName + "***************");
		for (String string : valueOfExpectedCol) {
			System.out.println(string);
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}