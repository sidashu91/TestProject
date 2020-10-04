package basicscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtables_Example2_PritAllColums_forParticularrow {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Java and Selenium\\Browser Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		String Url = "https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		// Rows = //*[@id="leftcontainer"]/table/tbody/tr
		// col =//*[@id="leftcontainer"]/table/tbody/tr[296]/td

		List<WebElement> list_Row_Webelement = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		String rowxpath_Start = "//*[@id='leftcontainer']/table/tbody/tr[";
		String rowxpath_end = "]";

		for (int i = 0; i < list_Row_Webelement.size(); i++) {

			if (list_Row_Webelement.get(i).getText().contains("Heritage Foods")) {
				System.out.println("Index of i = " + (i + 1));// since i starts from 0
				int expected_row_number = (i + 1);

				String complete_Row_Xpath = rowxpath_Start + expected_row_number + rowxpath_end;
				List<WebElement> list_of_particular_col = driver.findElements(By.xpath(complete_Row_Xpath + "/td"));

				for (int j = 0; j < list_of_particular_col.size(); j++) {
					System.out.println("Ashok Leyland " + (j + 1) + "st" + " row Value: "
							+ list_of_particular_col.get(j).getText());
				}
			}

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}