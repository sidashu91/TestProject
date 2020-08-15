package sampleCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestPageObjects {
	WebDriver driver;
	
	public TestPageObjects (WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@id='username']");
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	
	By pass = By.cssSelector("input[class='password']");
	public WebElement getPassword() {
		return driver.findElement(pass);
	}
	
	By submit = By.id("submit");
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	
	By dropdown = By.tagName("select");
	public WebElement getDropdown() {
		return driver.findElement(dropdown);
	}
	
	By go = By.className("goBtn");
	public WebElement getGoButton() {
		return driver.findElement(go);
	}
}