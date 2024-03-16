package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Y_axis {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int X = driver.findElement(By.name("login")).getLocation().getX();
		int Y = driver.findElement(By.name("login")).getLocation().getY();
		System.out.println(X+ "==>" + Y);
		driver.quit();
		
	}
}