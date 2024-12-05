package com.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseClass{
	
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Drag and Drop')]")).click();
		
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(source, target).build().perform();
		
		String text = driver.findElement(By.xpath("//*[@id=\"column-a\"]/header")).getText();
		
		Assert.assertEquals(text, "B", "B is not present");
		
//		Thread.sleep(3000);
	}
}
