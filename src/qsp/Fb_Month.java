package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_Month {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement mmonth = driver.findElement(By.id("month"));
		WebElement mday = driver.findElement(By.id("day"));
		WebElement myear = driver.findElement(By.id("year"));
		Select s = new Select(mday);
		s.selectByVisibleText("2");
		Select s1 = new Select(mmonth);
		s1.selectByValue("11");
		Select s2 = new Select(myear);
		s2.selectByValue("1991");
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
