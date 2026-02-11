package com.headless.browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import library.Reusability;

public class HeadlessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium  4.40\\Chrome Browser Jars\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1366x768");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		Reusability.capturedScreenShot(driver, "1. Launch Application -TakeCsreenshot");
		
		System.out.println("Browser Title is: "+driver.getTitle());
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("log_email")).sendKeys("9876543210");
		Reusability.capturedScreenShot(driver, "2. Enter Username -TakeCsreenshot");
		
		driver.findElement(By.id("log_password")).sendKeys("abc@123");
		Reusability.capturedScreenShot(driver, "3. Enter Password -TakeCsreenshot");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		Reusability.capturedScreenShot(driver, "4. Click Submit Application");
		
		
	}

}
