package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_text_mainID_textbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("password")).clear();
	Thread.sleep(2000);
	driver.close();
	}
}
