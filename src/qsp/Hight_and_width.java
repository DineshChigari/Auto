package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hight_and_width {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement log = driver.findElement(By.name("login"));
		int hight = log.getSize().getHeight();
		int width = log.getSize().getWidth();
		System.out.println(hight + " :Hight");
		System.out.println(width+ " : Width");
		driver.quit();
	}
}
