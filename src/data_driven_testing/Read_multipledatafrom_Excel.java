package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_multipledatafrom_Excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();
	for (int i = 0;i<rowcount;i++)
	{
		String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() =\"Login \"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
}
