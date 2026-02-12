package com.coforge.ddtFromCSVFile;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;
import library.Reusability;
import utility.Helper;

public class DDTCSVFile {
	String CsvPath = "C:\\BootCampSeleniumTesting2026\\CSV Test Data\\CSV TestData.csv";
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver= Helper.startBrowser("Chrome");
		driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");
		driver.navigate().refresh();
		Reusability.capturedScreenShot(driver, "Step 1. Login to only-testing-blog Appplication");
	}

	@Test
	public void locatorsTestingBlog() throws Exception {

		CSVReader reader = new CSVReader(new FileReader(CsvPath));
		String[] csvCell;

		while ((csvCell = reader.readNext()) != null) {

			String FName = csvCell[0];
			String LName = csvCell[1];
			String Email = csvCell[2];
			String MNum = csvCell[3];
			String CName = csvCell[4];

			driver.findElement(By.name("FirstName")).sendKeys(FName);
			driver.findElement(By.name("LastName")).sendKeys(LName);
			driver.findElement(By.name("EmailID")).sendKeys(Email);
			driver.findElement(By.name("MobNo")).sendKeys(MNum);
			driver.findElement(By.name("Company")).sendKeys(CName);

			driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

			driver.switchTo().alert().accept();

			Reusability.capturedScreenShot(driver, "Step2. Refresh only-testing-blog Application");
		}

		reader.close();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
