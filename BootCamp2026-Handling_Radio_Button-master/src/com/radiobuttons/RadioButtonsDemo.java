package com.radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class RadioButtonsDemo {
	public WebDriver driver;
	
	@Test 
	public void TestDemoRadioButton() throws Exception {
		driver = Helper.startBrowser("Edge");
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='male']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='female']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
