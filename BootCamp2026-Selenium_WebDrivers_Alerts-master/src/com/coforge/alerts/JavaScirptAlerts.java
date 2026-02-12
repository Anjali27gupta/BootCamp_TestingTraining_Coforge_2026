package com.coforge.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class JavaScirptAlerts {
	@Test
	public void TestPopups() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String result = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You successfully clicked an alert", result);
		
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		String result1 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result1);
		Assert.assertEquals("You clicked: Ok", result1);
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		String result2 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You clicked: Ok", result2);
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		String result3 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result3);
		Assert.assertEquals("You entered: Hello", result3);
		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		String result5= driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials']")).getText();
//		System.out.println(result5);
//		Assert.assertEquals("Congratulations! You must have the proper credentials", result3);
		
		
		
		driver.quit();
		


}
}