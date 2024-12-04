package com.selenium_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlerts extends BaseClass{

	@Test
	public void test() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'JavaScript Alerts')]")).click();
		
		//Normal Alert
		driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Alert')]")).click();
		HandleAlerts.acceptAlert(driver);
		
//		Assertion
		String result = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(result, "You successfully clicked an alert", "Assertion Failed!!!!");
		
		//Confirmation Alert
		driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Confirm')]")).click();
		HandleAlerts.dismissAlert(driver);
		
//		Assertion
		String result1 = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(result1, "You clicked: Cancel", "Assertion Failed!!!!");
		
		
		// Prompt Alert
		driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Prompt')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("This is prompt alert");
		alert.accept();
		
//		Assertion
		String result2 = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(result2, "You entered: This is prompt alert", "Assertion Failed!!!!");
		
		
	}
	
	public static void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public static void dismissAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
}
