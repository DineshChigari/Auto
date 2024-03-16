package data_driven_testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.Filelab;

public class DemoGenericLab {
public static void main(String[] args) throws IOException, InterruptedException {
	Filelab f = new Filelab();
	WebDriver driver = new ChromeDriver();
	driver.get(f.getPropertyData("url"));
	driver.findElement(By.id("username")).sendKeys(f.getPropertyData("username"));
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text() =\"Login \"]")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
}
}
