package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JJJJ {
	static WebDriver driver;
	public static  void running() throws InterruptedException
	{
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Hello");
		Thread.sleep(2000);
	}
	@ Test 
	public static void run () throws InterruptedException{
		driver = new ChromeDriver();
		String acttitle = "Gogle";
		driver.get("https://www.google.com/");
		String title = driver.getTitle();

		if (acttitle.equalsIgnoreCase(title))
		{
			Thread.sleep(2000);
			running();	
		}
		else
		{
			Thread.sleep(2000);
			running();	
		}
		driver.quit();
	}
}


