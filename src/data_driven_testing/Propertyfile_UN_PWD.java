package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class Propertyfile_UN_PWD {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./data/username admin.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		WebDriver driver =  new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() =\"Login \"]")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
