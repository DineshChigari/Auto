package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_logo_display_Enable {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/");
	boolean logo = driver.findElement(By.xpath("//img[@alt = \"Facebook\"]")).isDisplayed();
	if (logo)
	{
		System.out.println("logo is displayed and pass");
	}
	else
	{
		System.out.println("logo is not displayed and fail");
	}
	
	boolean loginbutton = driver.findElement(By.name("login")).isEnabled();
	if (loginbutton)
	{
		System.out.println("Lign button is Enabled and pass");
	}
	else
	{
		System.out.println("Login button disabled and fail");
	}
	driver.quit();
}
}
