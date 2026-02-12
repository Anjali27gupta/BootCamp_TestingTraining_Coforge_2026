package com.selenium.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) {
		String[] urls = {"https://opensource-demo.orangehrmlive.com/",
				"https://demo.opencart.com/","https://www.bing.com/",
				"https://the-internet.herokuapp.com/javascript_alerts",
				"https://only-testing-blog.blogspot.com/",
				"https://www.demoblaze.com/",
				"https://testautomationpractice.blogspot.com/",
				"https://practicetestautomation.com/practice-test-login/",
				"https://www.chase.com/",
				"https://accounts.saucelabs.com/am/XUI/#login/"};
		
		WebDriver c_driver = new ChromeDriver(); 
		for( String url : urls) {
			c_driver.get(url);
			c_driver.manage().window().maximize();
			
		}
		c_driver.quit();
		WebDriver e_driver = new EdgeDriver();
		for( String url1 : urls) {
			e_driver.get(url1);
			e_driver.manage().window().maximize();
			
		}
		e_driver.quit();
		
		WebDriver f_driver = new FirefoxDriver();
		for( String url2 : urls) {
			f_driver.get(url2);
			f_driver.manage().window().maximize();
			
		}
		f_driver.quit();
	}
}
