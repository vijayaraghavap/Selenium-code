package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("vijay@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12304569@");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement fb = driver.findElement(By.xpath("//div[contains(text() , 'Log in to Facebook')]"));
		String text = fb.getText();				
		
		if(text.equals("Log in to Facebook"))
		{
			System.out.println(text+"pass");
			
		}else{
			System.out.println(text+"fail");
		}
		
		WebElement wp = driver.findElement(By.xpath("//div[contains(text()  , 'The password that you')]"));
		String text2 = wp.getText();
		System.out.println(text2);				
		
		String attribute = wp.getAttribute("class");
		System.out.println(attribute);
		
		String cssValueFont = wp.getCssValue("font-size ");
		System.out.println(cssValueFont);
		
		String color = wp.getCssValue("color");
		System.out.println(color);
	}
}
