package com.coforge.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.saucelabs.com/am/XUI/#login/");
		driver.manage().window().maximize();
		driver.quit();

	}

}