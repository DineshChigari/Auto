package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrrenShot {

public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	TakesScreenshot t = (TakesScreenshot)driver;
	 File scr = t.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./Screenshot/sp.png");
	 FileUtils.copyFile(scr, dest);
}
}
