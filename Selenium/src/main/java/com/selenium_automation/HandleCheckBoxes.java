package com.selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleCheckBoxes extends BaseClass{
	
	
	@Test
	public void test() {
		
		driver.findElement(By.xpath("//a[text() = 'Checkboxes']")).click();
		List<WebElement> checkboxElements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("No. of Checkbox size : " + checkboxElements.size());
		
		for(WebElement checkbox : checkboxElements) {
			
			System.out.println("Is Selected : " + checkbox.isSelected());
			
			if(!checkbox.isSelected()) {
				checkbox.click();
			}
		}
		
	}

}
