package com.actitime.generics;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
public static WebDriver driver;

@BeforeClass
public void openBrowser()
{
driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@AfterClass
public void closeBrowser()
{
driver.quit();	
}

@BeforeMethod
public void login() throws InterruptedException
{
driver.get("http://localhost/login.do");
driver.findElement(By.name("username")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
Thread.sleep(2000);
}

@AfterMethod
public void logout()
{
driver.findElement(By.linkText("Logout")).click();
}
}
