package com.coforge.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.Helper;
import library.Reusability;

public class TestDemoDDT {
	public WebDriver driver;
	@Test(dataProvider = "EasyCalculation")
	public void Browser(String UserName, String Password) throws Exception {
		driver= Helper.startBrowser("Chrome");
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		driver.manage().window().maximize();
		Reusability.capturedScreenShot(driver, "Step1. Login to EasyCalc Application");
		driver.findElement(By.id("log_email")).sendKeys(UserName);
		driver.findElement(By.id("log_password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		Thread.sleep(5000);
		Reusability.capturedScreenShot(driver, "Step2. Logout of the Application");
		driver.quit();
		
	}
	@DataProvider(name="EasyCalculation")
	public Object[][] passData(){
		Object[][] data =new Object[3][2];
		data[0][0]="9876543210";
		data[0][1]="raghubn";
		
		data[1][0] ="9846952790";
		data[1][1]="raghubn@123";
		
		data[2][0]="raghubn2";
		data[2][1]="raghubn1";
		return data;
		
	}

}
