package seleniumCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.driver",System.getProperty("user.dir")+"//lib//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\ChromeDriverV76\\chromedriver.exe");

		WebDriver chromeDriver = new ChromeDriver();
		System.out.println(chromeDriver.getTitle());
		
		chromeDriver.get("http://google.com");
		
		
	}

}
