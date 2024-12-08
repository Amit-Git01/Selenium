package com.selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaticTable extends BaseClass{

	@Test
	public void test() {
		
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		
		String actual = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h4[2]")).getText();
		String expected = "Example 2";
		
		Assert.assertEquals(actual, expected, "Assertion Failed!!");
		
		WebElement table = driver.findElement(By.id("table2"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		int rowSize = rows.size();
		
		for(int a = 0; a < rowSize; a++) {
			
			List<WebElement> cols = rows.get(a).findElements(By.tagName("td"));
			
			int colSize = cols.size();
			
			for(int b = 0; b < colSize-1; b++) {
				
				System.out.print(cols.get(b).getText() + " | ");
			}
			System.out.println();
		}
	}
	
}
