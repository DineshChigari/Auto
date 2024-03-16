package qsp;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enadbled {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost/login.do");
	boolean check = driver.findElement(By.id("keepLoggedInCheckBox")).isEnabled();
	System.out.println(check);
	driver.quit();
	}

}
