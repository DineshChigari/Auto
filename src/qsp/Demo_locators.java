package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_locators {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("‪C:\\Users\\dines\\OneDrive\\Desktop\\Spider.html");
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		driver.findElement(By.name("nl")).click();
		driver.navigate().back();
		driver.findElement(By.className("cl")).click();
		driver.navigate().back();
		driver.quit();

	}
}
