package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Scroll {

	WebDriver driver;

	@Test
	public void ByPixel() {
		System.setProperty("webdriver.chrome.driver", "E://Selenium//Selenium_Jars//chromedriver.exe");
		driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		// To maximize the window. This code may not work with Selenium 3 jars. If
		// script fails you can remove the line below
		driver.manage().window().maximize();

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");
	}

	@Test
	public void ByVisibleElement() {
		System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		// Find element by link text and store in variable "Element"
		WebElement Element = driver.findElement(By.linkText("Linux"));

		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	@Test
	public void ByPage() {
		System.setProperty("webdriver.chrome.driver", "E://Selenium//Selenium_Jars//chromedriver.exe");
		driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		// This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}