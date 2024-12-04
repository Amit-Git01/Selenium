package com.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
