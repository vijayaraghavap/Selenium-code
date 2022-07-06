package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions 
{
	public static void main(String[] args) throws AWTException, Exception 
	{
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		org.openqa.selenium.interactions.Actions a = new org.openqa.selenium.interactions.Actions(driver);
	
		WebElement user = driver.findElement(By.name("email"));
		a.sendKeys(user, "vijay").build().perform();
		
		WebElement pass = driver.findElement(By.id("pass"));
		a.sendKeys(pass, "121456135168").build().perform();
		
		WebElement login = driver.findElement(By.name("login"));
		a.click(login).build().perform();
		
		WebElement fb = driver.findElement(By.xpath("//div[contains(text() , 'Log in to Facebook')]"));
		a.doubleClick(fb).build().perform();
		a.contextClick(fb).build().perform();
		
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000); 
		
		WebElement email = driver.findElement(By.name("email"));
		a.doubleClick(email).build().perform();
		Thread.sleep(2000);
		email.clear();
		a.contextClick(email).build().perform();
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		//r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fp = driver.findElement(By.xpath("(//a[contains(text() , 'Forgotten password?')])[2]"));
		a.moveToElement(fp).build().perform();
		
	}
}


