package com.coforge.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.quit();

	}

}
