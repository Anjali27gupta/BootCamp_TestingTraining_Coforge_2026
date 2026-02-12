package com.coforge.crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import library.Reusability;
 
public class CrossBrowserTest {
	WebDriver driver;
	String BaseURL = "https://www.login.hiox.com/login?referrer=easycalculation.com";
	
	@Parameters({"browserName"})
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser name is: " + browserName);
		
		if(browserName.equalsIgnoreCase("Chrome") || browserName.equalsIgnoreCase("GC")||
				browserName.equalsIgnoreCase("Google Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("FF") || browserName.equalsIgnoreCase("Firefox")
				|| browserName.equalsIgnoreCase("Mozila")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("Edge") || browserName.equalsIgnoreCase("EG")
				|| browserName.equalsIgnoreCase("Microsoft Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}}
		
		@Test
		public void BrowserTest() {
			driver.get(BaseURL);
 
			Reusability.capturedScreenShot(driver, "Step1. Login To EasyCalculation Application");
			driver.findElement(By.id("log_email")).sendKeys("9740673180");
			driver.findElement(By.id("log_password")).sendKeys("raghuBN@123");
			driver.findElement(By.xpath("//input[@name='log_submit']")).click();
			
			Reusability.capturedScreenShot(driver, "Step2. Logout EasyCalculation Application");
		}
			@AfterTest
			public void tearDown() {
				driver.quit();
			}
}
 