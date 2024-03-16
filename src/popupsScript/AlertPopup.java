package popupsScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.css.sac.Condition;

public class AlertPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class = \"btn btn-danger\"]")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a = driver.switchTo().alert();
	String alerttext = a.getText();
	System.out.println(alerttext);
	Thread.sleep(2000);
	a.accept();
}
}
