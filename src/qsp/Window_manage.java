package qsp;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_manage {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.google.co.in/");
	Options Manage = driver.manage();
	Manage.window().minimize();
	Thread.sleep(1000);
	Manage.window().maximize();
	Thread.sleep(1000);
	Dimension size = Manage.window().getSize();
	System.out.println(size);
	driver.quit();
	
	
}
 }
