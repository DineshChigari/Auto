package popupsScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

public class AlertOkCancleButton {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		WebElement message = driver.findElement(By.id("demo"));
		String text = message.getText();
		System.out.println(text);


	}
}
