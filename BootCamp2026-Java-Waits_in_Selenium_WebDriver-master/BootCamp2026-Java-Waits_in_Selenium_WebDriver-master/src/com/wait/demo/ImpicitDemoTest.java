package com.wait.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import library.Reusability;
import utility.Helper;


public class ImpicitDemoTest {

	public WebDriver driver;
	@Test
	public void DemoImpicit() {
		driver =Helper.startBrowser("Edge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		Reusability.capturedScreenShot(driver, "1. Launch Application -TakeCsreenshot");
		
		driver.findElement(By.name("q")).sendKeys("easemytrip"+Keys.ENTER);
		Reusability.capturedScreenShot(driver, "Enter Username -TakeCsreenshot");
		}
}
