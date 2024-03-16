package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class First_selectedoption_SLCV {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/dines/OneDrive/Desktop/Hotel.html");
	WebElement slvlist = driver.findElement(By.id("slv"));
	Select s = new Select(slvlist);
	WebElement fopt = s.getFirstSelectedOption();
	String item = fopt.getText();
	System.out.println(item);
	Thread.sleep(3000);
	driver.quit();
	}
}
