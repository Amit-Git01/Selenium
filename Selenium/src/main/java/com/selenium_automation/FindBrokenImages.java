package com.selenium_automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindBrokenImages extends BaseClass {

	@Test
	public void test() {

		driver.findElement(By.xpath("//a[contains(text(), 'Broken Images')]")).click();

		List<WebElement> images = driver.findElements(By.xpath("//div[@class='example']/img"));

		for (WebElement image : images) {

			String srcLink = image.getDomProperty("src");

			try {
				URL url = new URL(srcLink);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();

				int statusCode = connection.getResponseCode();

				if (statusCode != 200) {
					System.out.println("Image is broken : " + srcLink + " Status Code : " + statusCode);
				} else {
					System.out.println("Image is not broken : " + srcLink + " Status Code : " + statusCode);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
