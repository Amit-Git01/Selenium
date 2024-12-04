package com.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyPressUsingActionClass extends BaseClass{

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//a[text() = 'Key Presses']")).click();
		
		WebElement target = driver.findElement(By.id("target"));
		
		Actions actions = new Actions(driver);
		
//		actions.sendKeys(target , "S").build().perform();
		
		
		actions.sendKeys(target, Keys.SPACE).sendKeys(target, "A")
		.sendKeys(target, Keys.BACK_SPACE).build().perform();
		
		
		Thread.sleep(4000);
		
		String result = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
	}
}
