package com.wait.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import library.Reusability;
import utility.Helper;

public class ExplicitDemoTest {
	public WebDriver driver;
	@Test
	public void DemoImpicit() {
		driver =Helper.startBrowser("Edge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.easycalculation.com/");
		Reusability.capturedScreenShot(driver, "1. Launch Application -TakeCsreenshot");
		
		driver.findElement(By.name("q")).sendKeys("Bangalore"+Keys.ENTER);
		Reusability.capturedScreenShot(driver, "Enter Username -TakeCsreenshot");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement mylink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='#']")));
		mylink.click();
		Reusability.capturedScreenShot(driver, "Enter Username -TakeCsreenshot");
	}
}
