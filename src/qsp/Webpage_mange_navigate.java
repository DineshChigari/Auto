package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage_mange_navigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/dines/OneDrive/Desktop/Spider.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id = 'd1']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[name = 'tl']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class = 'cl']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href = 'https://www.jspiders.com/']")).click();
		driver.quit();
	}
}
