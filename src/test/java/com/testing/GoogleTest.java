package com.testing;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleTest {
	
	
	@Test

	public void Google() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/sagara/eclipse-workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.quit();
	
	
	}
}