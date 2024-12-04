package com.selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropdown extends BaseClass{

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(), 'Dropdown')]")).click();
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select select = new Select(dropdown);
		
		List<WebElement> elements = select.getOptions();
		for(WebElement option : elements) {
			System.out.println(option.getText());
		}
		
//		select.selectByIndex(2);
		select.selectByVisibleText("Option 1");
		
		Thread.sleep(5000);
		
	}
}
