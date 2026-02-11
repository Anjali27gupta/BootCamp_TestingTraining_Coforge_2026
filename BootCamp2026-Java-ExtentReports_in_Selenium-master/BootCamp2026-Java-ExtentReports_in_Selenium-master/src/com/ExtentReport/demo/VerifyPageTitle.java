package com.ExtentReport.demo;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
 
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
 
import library.Reusability;
 
public class VerifyPageTitle {
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
 
	@Test
	public void VerifyTitle() {
		report = new ExtentReports("C:\\Testing Complete Material\\Extent Report\\ExtentReport.html");
		logger = report.startTest("Verify Page Title Using Assert");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser Launch Sucessfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		logger.log(LogStatus.INFO, "Enter User In EditBox");
		driver.findElement(By.id("password")).sendKeys("secret_sauce2");
		logger.log(LogStatus.INFO, "Enter Password In EditBox");
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		logger.log(LogStatus.INFO, "Click on Sign In Button");
		Assert.assertTrue(driver.getTitle().contains("Swag Labs"),
				"User Not Able to login successfullly - Invalid Credentials");
		System.out.println("User able to login Sucessfully - Valid Credentials");
		logger.log(LogStatus.PASS, "User successfully Login Application");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = Reusability.getCurrentDateTime();
			logger.log(LogStatus.FAIL, screenShotPath);
		}
		report.endTest(logger);
		report.flush();
		driver.get("C:\\Testing Complete Material\\Extent Report.html\\ExtentReport.html");
	}
 
}