package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FFFF {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class = 'btn btn-danger']")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	Thread.sleep(2000);
	Alert a = driver.switchTo().alert();Thread.sleep(2000);
	a.accept();Thread.sleep(2000);
	driver.close();
	
	
}
}
