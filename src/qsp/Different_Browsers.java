package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Different_Browsers {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.instagram.com/");
		driver.quit();
		driver1.quit();

	}
}
