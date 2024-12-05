package com.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickAndDoubleClick extends BaseClass{

	@Test
	public void test() throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'A/B Testing')]"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(element).perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text() = 'Checkboxes']")).click();
		
		WebElement doubleClickOnIt = driver.findElement(By.xpath("//h3[text() = 'Checkboxes']"));
		
		Actions actions1 = new Actions(driver);
		actions1.doubleClick(doubleClickOnIt).perform();
		
		Thread.sleep(4000);
	}
}
