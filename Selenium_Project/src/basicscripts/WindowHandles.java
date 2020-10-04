package basicscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","F:\\My Work\\TECH DATA\\seleniumproject\\Drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		Set<String> windids = driver.getWindowHandles();
		
		System.out.println(windids.size());
		
		
		Iterator<String> itr = windids.iterator();
		
		String fp = itr.next();
		String sp = itr.next();
		String tp = itr.next();
		
		System.out.println(fp);
		System.out.println(sp);
		System.out.println(tp);
		
		driver.switchTo().window(sp).close();
		
		System.out.println(driver.switchTo().window(tp).getTitle());
		System.out.println(driver.switchTo().window(tp).getCurrentUrl());
		
		
		
		
		
		
		
	}

}
