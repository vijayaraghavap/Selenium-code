package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Alert
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement c = driver.findElement(By.id("alertButton"));
		c.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement c1 = driver.findElement(By.id("timerAlertButton"));
		c1.click();
		Thread.sleep(5000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
				
		WebElement c2 = driver.findElement(By.id("confirmButton"));
		c2.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.dismiss();
		
		WebElement c3 = driver.findElement(By.id("promtButton"));
		c3.click();
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("VIJAY");
		alert4.accept();
	}
}
