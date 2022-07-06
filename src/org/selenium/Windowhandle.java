package org.selenium;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle
{
	public static void main(String[] args) throws AWTException, Exception 
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement closeIcon = driver.findElement(By.xpath("//button[text()='✕']"));
		closeIcon.click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("realme");
		Thread.sleep(2000);
		
		WebElement cb = driver.findElement(By.xpath("//button[@type='submit']"));
		cb.click();
		Thread.sleep(3000);
		WebElement realme = driver.findElement(By.xpath("(//div[contains(text() , 'realme')])[1]"));
		realme.click();
		
		
		String parentURL = driver.getWindowHandle();
		
		Set<String> allURL = driver.getWindowHandles();
		
		for (String URL : allURL) {
			if (!URL.equals(allURL)) {
				driver.switchTo().window(URL);
			}
			
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentURL);
		
	}
}
