package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		int count = alllink.size();
		for (int i=0; i<count;i++)
		{
			String text = alllink.get(i).getText();
			

		}
		
	}
}
