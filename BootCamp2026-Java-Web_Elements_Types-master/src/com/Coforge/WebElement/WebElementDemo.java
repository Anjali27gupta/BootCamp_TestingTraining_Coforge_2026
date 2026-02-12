package com.Coforge.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementDemo {
	WebDriver driver;
	@Test
	public void IDTest() {
		driver =new ChromeDriver();
		driver.get("https://mybookings.easemytrip.com/");
		driver.manage().window().maximize();
//		Thread.sleep(5000);
		
		
		 WebElement username= driver.findElement(By.id("txtEmailNew"));
		 System.out.println(username.isDisplayed());
		 System.out.println(username.isEnabled());
		 System.out.println(username.isSelected());
		 System.out.println(username.getTagName());
		 
		 username.sendKeys("vividwhimsy@gmail.com");
		 driver.findElement(By.xpath("//input[@id='shwotp']")).click();
		 
//		driver.quit();
	}

}
