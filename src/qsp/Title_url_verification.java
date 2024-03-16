package qsp;

import java.time.Duration;
import java.util.Set;

import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_url_verification {
public static void main(String[] args) {
	//To open the browser
	//Object creation of chromedriver class
	ChromeDriver driver = new ChromeDriver();
	// To open the webpage
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.google.co.in/");
	String CPurl = driver.getCurrentUrl();
	System.out.println("Current url: " +CPurl);
	String pagetitle = driver.getTitle();
	System.out.println("Current page title: " + pagetitle);
	/*String Cpsource = driver.getPageSource();
	System.out.println(Cpsource);*/
	//Object closer = driver.quit();
	 driver.close();
}
}
