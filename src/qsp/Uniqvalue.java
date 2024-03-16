package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uniqvalue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dines/OneDrive/Desktop/Hotel.html");
		WebElement Mlist = driver.findElement(By.id("mtr"));
		Select s = new Select(Mlist);
		List<WebElement> weblist = s.getOptions();
		int count = weblist.size();
		HashSet hs =  new HashSet();
		for(int i = 0;i<count;i++)
		{
			String text = weblist.get(i).getText();
			hs.add(text);
		}	
		for( Object i: hs)
		{
			System.out.println(i);
		}
	}
}
