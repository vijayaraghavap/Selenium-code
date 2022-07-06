package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		org.openqa.selenium.interactions.Actions a = new org.openqa.selenium.interactions.Actions(driver);
		
		WebElement source1 = driver.findElement(By.xpath("//a[contains(text() , 'BANK')]"));
		WebElement target1 = driver.findElement(By.xpath("(//ol[@align = 'center'])[1]"));
		a.dragAndDrop(source1, target1).build().perform();
		Thread.sleep(2000);
		
		WebElement source2 = driver.findElement(By.xpath("//a[contains(text() , ' 5000 ')]"));
		WebElement target2 = driver.findElement(By.xpath("(//ol[@align = 'center'])[2]"));
		a.dragAndDrop(source2, target2).build().perform();
		
		WebElement source3 = driver.findElement(By.xpath("//a[contains(text() , ' SALES ')]"));
		WebElement target3 = driver.findElement(By.xpath("(//ol[@align = 'center'])[3]"));
		a.dragAndDrop(source3, target3).build().perform();
		
		WebElement source4 = driver.findElement(By.xpath("//a[contains(text() , ' 5000 ')]"));
		WebElement target4 = driver.findElement(By.xpath("(//ol[@align = 'center'])[4]"));
		a.dragAndDrop(source4, target4).build().perform();
		Thread.sleep(2000);
		
		WebElement perfect = driver.findElement(By.xpath("//a[text() = 'Perfect!']"));
		a.moveToElement(perfect).build().perform();
		
		WebElement value1 = driver.findElement(By.id("t7"));
		String text = value1.getText();
		System.out.println("Debit Movement" + text);
		
		WebElement value2 = driver.findElement(By.id("t8"));
		String text2 = value2.getText();
		System.out.println("Credit Movement	" + text2);
		
		if(text.equals(text2))
		{
			System.out.println("Pass");
		}
		else
		{	
			System.out.println("Fail");
		}
		
	}
}
