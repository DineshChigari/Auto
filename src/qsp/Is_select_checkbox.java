package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_select_checkbox {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost/login.do");
	boolean checkbox = driver.findElement(By.name("remember")).isSelected();
	if(checkbox)
	{
		System.out.println("Check box is selected");
	}
	else
	{
		System.out.println("Check box is not selected");
	}
	driver.quit();
}
}
