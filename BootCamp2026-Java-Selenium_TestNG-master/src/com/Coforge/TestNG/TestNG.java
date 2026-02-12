package com.Coforge.TestNG;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

// how to execute testng
public class TestNG {
	@Test
	public void chrometest() {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.quit();

	}
	@Test
    public void edgetest() {
    	EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
 		driver.quit();
	}
	@Test
     public void firefoxtest() {
    	    FirefoxDriver driver = new FirefoxDriver();
 		driver.get("http://www.google.com/");
 		driver.manage().window().maximize();
 		driver.quit();
     }

}
