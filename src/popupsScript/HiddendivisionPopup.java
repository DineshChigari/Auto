package popupsScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddendivisionPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Dinesh");Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Dinesh@gmail.com");Thread.sleep(2000);
	WebElement opt = driver.findElement(By.xpath("//select[@required]"));
	Select s = new Select(opt);
	s.selectByIndex(1); Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	driver.quit();
			
}
}
