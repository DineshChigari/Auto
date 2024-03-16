package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import dev.failsafe.function.CheckedRunnable;

public class Fb_loginbutton_text_ {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	boolean text = driver.findElement(By.name("login")).isEnabled();
	System.out.println(text);
	driver.quit();
	
}
}
