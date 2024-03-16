package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hight_width_UN_PWD {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.name("email"));
		WebElement pwd = driver.findElement(By.id("passContainer"));
		int hight = un.getSize().getHeight();
		int width = un.getSize().getWidth();
		int hight1 = pwd.getSize().getHeight();
		int width1 = pwd.getSize().getWidth();
		if(hight==hight1&&width==width1)
		System.out.println("Username and password text fileds are properly alligned.");
		else
		System.out.println("Username and password text fileds are not properly alligned.");
		driver.quit();
	}
}
