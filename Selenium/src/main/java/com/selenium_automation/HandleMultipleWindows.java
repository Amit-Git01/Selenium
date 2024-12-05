package com.selenium_automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleMultipleWindows extends BaseClass{

	@Test
	public void test() {
		
		driver.findElement(By.xpath("//a[contains(text(), 'Multiple Windows')]")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			
			if(!window.equals(parentWindow)) {
				
				String windowTitle = driver.switchTo().window(window).getTitle();
				
				if(windowTitle.equals("New Window")) {
					driver.switchTo().window(window);
					
					String text = driver.findElement(By.xpath("/html/body/div/h3")).getText();
					System.out.println(text);
				}
			}
		}
		
	}
}
