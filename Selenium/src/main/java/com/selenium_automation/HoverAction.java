package com.selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverAction extends BaseClass{

	@Test
	public void test() {
		
		driver.findElement(By.xpath("//a[text()='Hovers']")).click();
		
		List<WebElement>figures = driver.findElements(By.xpath("//div[@class='figure']"));
		
		Actions actions = new Actions(driver);
		
		for(WebElement figure : figures) {
			actions.moveToElement(figure).perform();
			
			WebElement caption = figure.findElement(By.className("figcaption"));
			
			if(caption.isDisplayed()) {
				System.out.println(caption.getText());
			}
			System.out.println("");
		}
	}
}
