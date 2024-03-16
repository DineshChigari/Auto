package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Webpage {
	public static void main(String[] args) {
		//UPCASTING chromeDriver class object into WebDriver reference variable. 
		WebDriver driver = new ChromeDriver();
		String Etitle = "Google";
		String Eurl = "https://www.google.co.in/";
		driver.get("https://www.google.co.in/");
		String Aurl = driver.getCurrentUrl();
		String Atitle = driver.getTitle();
		if(Etitle.equalsIgnoreCase(Atitle))
		{
			System.out.println("Bothe titles are same");
		}
		else{
			System.out.println("Both titles are not same");
		}
		if(Eurl.equalsIgnoreCase(Aurl))
		{
			System.out.println("Both urls are same. ");
		}
		else
		{
			System.out.println("Both titles aer not same.");
		}
		driver.quit();
	}
}

