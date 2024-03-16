package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mrt_AllOption {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\dines\\OneDrive\\Desktop\\Hotel.html");
	WebElement mtrlist =driver.findElement(By.id("mtr"));
	Select s = new Select(mtrlist);
	List<WebElement> alloption = s.getOptions();
	int count = alloption.size();
	for (int i=0;i<count;i++)
	{
		
		String text = alloption.get(i).getText();
		System.out.println(text);
	}
	driver.quit();
}
}
