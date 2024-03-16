package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	//downcasting of driver referance veriable into TakeScreenShot type referance veriable 
	TakesScreenshot t = (TakesScreenshot)driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShot/ss.png");
	FileUtils.copyFile(src, dest);
	driver.quit();
	}
}
