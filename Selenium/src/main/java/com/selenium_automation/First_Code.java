package com.selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class First_Code {
	
	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		/*  Automate login functionality.
		 * 
		 * https://magento.softwaretestingboard.com/
		 */
		
		driver = new EdgeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		/*
		 * driver.findElement(By.linkText("Create an Account")).click();
		 * 
		 * driver.findElement(By.id("firstname")).sendKeys("Selo");
		 * driver.findElement(By.id("lastname")).sendKeys("Jem");
		 * driver.findElement(By.id("email_address")).sendKeys("selenium012@gmail.com");
		 * driver.findElement(By.id("password")).sendKeys("password@123");
		 * driver.findElement(By.id("password-confirmation")).sendKeys("password@123");
		 * driver.findElement(By.xpath("(//div[@class = 'primary']//span)[1]")).click();
		 */
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("selenium012@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password@123");
		driver.findElement(By.xpath("(//span[text() = 'Sign In'])[1]")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}
}
