package com.selenium.ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import obj.Utility.ConfigFileReader;

public class ObjectRepositaryDemo {
	@Test
	public void ConfigRead() {
		ConfigFileReader config = new ConfigFileReader();
		
		System.setProperty("webdriver.Edge.driver", config.getEdgePath());
		WebDriver driver = new EdgeDriver();
		
		driver.get(config.getAppURL());
		driver.manage().window().maximize();
		driver.findElement(By.id(config.UName())).sendKeys("standard_user");
		driver.findElement(By.id(config.PWord())).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath(config.SignButton())).click();
	}
}
