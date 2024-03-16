package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLcode_pagesource {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String Htmlcode = driver.getPageSource();
	System.out.println(Htmlcode);
	driver.quit();
}
}
