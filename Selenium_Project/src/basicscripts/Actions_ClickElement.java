package basicscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ClickElement {

	public static void click(WebDriver localDriver, String LocalId) {

		Actions act = (Actions) localDriver;
		act.moveToElement(localDriver.findElement(By.id(LocalId))).click().build().perform();

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");

		Actions_ClickElement.click(driver, "persistent");
	}

}
