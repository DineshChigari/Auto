package data_driven_testing;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.Filelab;

public class Login_withExcel_data {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	Filelab f = new Filelab();
	WebDriver driver = new ChromeDriver();
	driver.get(f.getPropertyData("url"));
	driver.findElement(By.id("username")).sendKeys(f.getExcelData("InvalidLogin", 0, 0));
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(f.getExcelData("InvalidLogin", 0, 1));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text() =\"Login \"]")).click();
	Thread.sleep(4000);
	driver.quit();
	
}
}
