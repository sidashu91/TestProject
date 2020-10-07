package SeleniumCodes_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll_By_Elements {

	
//@Test
//void scrollByElement() 
	public static void main(String[] args) 
{
	System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");  
	WebDriver driver = new ChromeDriver();
	driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	driver.manage().window().maximize();
    driver.getTitle();
    WebElement element1 = driver.findElement(By.xpath("//div[@id='mCSB_3_container']//p[contains(text(),'Neque porro quisquam est, qui dolorem ipsum quia d')]"));
    WebElement element2 = driver.findElement(By.xpath("//div[@id='content-8']//p[5]"));
    
    JavascriptExecutor je =  (JavascriptExecutor) driver;
    //je.executeScript("window.scrollBy(0,10000000000)");
    je.executeScript("arguments[0].scrollIntoView(true)", element2);
	je.executeScript("arguments[0].scrollIntoView(true)", element1);
    System.out.println(element2.getText());	
	
}

}
