package com.coforge.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowserTest {

		public static void main(String[] args) {
	         ChromeDriver driver = new ChromeDriver();
	         driver.get("https://www.selenium.dev/downloads/");
	 		driver.manage().window().maximize();
	 		driver.quit();
		}


}
