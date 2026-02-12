package com.Coforge.SeleniumWebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class MultipleBrowserDemo {
	WebDriver driver;
	String ChromeBaseUrl ="https://www.selenium.dev/downloads/";
	String FireFoxBaseUrl ="https://www.hollandandbarrett.com/";
	String EdgeBaseUrl = "https://testng.org/";
	
	@Test(priority=2)
	public void chrombrowsertest() {
		driver= new ChromeDriver();
		driver.get(ChromeBaseUrl);
		driver.manage().window().maximize();
		
		String expectedTitle = "Downloads | Selenium";
		String actualTitle= driver.getTitle();
		String url = driver.getCurrentUrl();
		int urlLength = url.length();
		System.out.println("Current UrL: "+url);
		System.out.println("URL Length: "+urlLength);
		
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched : test script passed: did a wonderful job......!");
		}else {
			System.out.println("Title not matched : test script failed: Try again......!");
			
		}
		String actualURL = url;
		String expectedURL= driver.getCurrentUrl();
		driver.navigate().refresh();
		if(actualURL.equals(expectedURL)) {
			System.out.println("URL matched : test script passed: did a wonderful job......!");
		}else {
			System.out.println("URL not matched : test script failed: Try again......!");
			
		}
			
		driver.quit();
	};
	
	@Test(priority=0)
	public void edgebrowsertest() {
		driver= new EdgeDriver();
		driver.get(EdgeBaseUrl);
		driver.manage().window().maximize();
		
		
		String expectedTitle = "TestNG Documentation";
		String actualTitle= driver.getTitle();
		String url = driver.getCurrentUrl();
		int urlLength = url.length();
		System.out.println("Current UrL: "+url);
		System.out.println("URL Length: "+urlLength);
		
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched : test script passed: did a wonderful job......!");
		}else {
			System.out.println("Title not matched : test script failed: Try again......!");
			
		}
		String actualURL = url;
		String expectedURL= driver.getCurrentUrl();
		driver.navigate().refresh();
		if(actualURL.equals(expectedURL)) {
			System.out.println("URL matched : test script passed: did a wonderful job......!");
		}else {
			System.out.println("URL not matched : test script failed: Try again......!");
			
		}
		driver.quit();
		
	}
	@Test(priority=1)
	public void firefoxbrowsertest() {
		driver = new FirefoxDriver();
		driver.get(FireFoxBaseUrl);
		driver.manage().window().maximize();
		
		
		String expectedTitle = "Holland & Barrett - The UK's Leading Health & Wellness Store";
		String actualTitle= driver.getTitle();
		String url = driver.getCurrentUrl();
		int urlLength = url.length();
		System.out.println("Current UrL: "+url);
		System.out.println("URL Length: "+urlLength);
		
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched : test script passed: did a wonderful job......!");
		}else {
			System.out.println("Title not matched : test script failed: Try again......!");
			
		}
		String actualURL = url;
		String expectedURL= driver.getCurrentUrl();
		driver.navigate().refresh();
		if(actualURL.equals(expectedURL)) {
			System.out.println("URL matched : test script passed: did a wonderful job......!");
		}else {
			System.out.println("URL not matched : test script failed: Try again......!");
			
		}
		driver.quit();
		
	}
}
