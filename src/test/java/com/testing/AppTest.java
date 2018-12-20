package com.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
	
	
	@Test

	public void YahooTest() {
		System.setProperty("webdriver.gecko.driver", "/Users/sagara/eclipse-workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		driver.quit();
		
		
		
		
	}
}