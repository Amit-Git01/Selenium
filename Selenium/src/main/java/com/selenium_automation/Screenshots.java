package com.selenium_automation;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshots extends BaseClass{

	@Test
	public void test() throws IOException, AWTException {
		
		// takes only showing window screenshot without url & tabs
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("./Screenshot/window.png"));
		
		// take screenshot with url & tabs
		Robot robot = new Robot();
		
		Rectangle screenshot = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		
		BufferedImage srcShot = robot.createScreenCapture(screenshot);
		
		ImageIO.write(srcShot,"png", new File("./screenshot/withurl.png"));
		
	}
}
