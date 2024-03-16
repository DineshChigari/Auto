package popupsScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithTextBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
	driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alt = driver.switchTo().alert();
	String text = alt.getText();
	System.out.println(text);
	alt.sendKeys("Dinesh");Thread.sleep(2000);
	alt.accept();
	 String message = driver.findElement(By.id("demo1")).getText();
	System.out.println(message);Thread.sleep(2000);
	driver.quit();
}
}
