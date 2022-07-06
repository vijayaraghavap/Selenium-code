package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first 
{
	public static void main(String[] args) 
	{
		//Browser Initialization
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		//to launch browser----get url
		
		driver1.get("https://www.facebook.com/");
		
		//to maximize window
		
		driver1.manage().window().maximize();
		
		//to get title
		
		String title = driver1.getTitle();
		System.out.println(title);
		
		//to get current url
		
		String currentUrl = driver1.getCurrentUrl();
		System.out.println(currentUrl);
		
		// navigation command
		driver1.navigate().refresh();
		
		//close
		driver1.close();
	}
}
