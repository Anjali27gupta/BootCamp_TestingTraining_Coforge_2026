package com.coforge.casestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void linkTest() throws ElementClickInterceptedException, InterruptedException{
		driver.navigate().to("https://www.easycalculation.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Age Calculator")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> images= driver.findElements(By.xpath("//img"));
		int linkCount = links.size();
		System.out.println("Number of links in Application:  "+linkCount);
		
		for (int i =0 ; i < 10;i++) {
			System.out.println("links: "+links.get(i).getAttribute("href"));
		}
		
		int imgCount=images.size();
		System.out.println("Number of images in Application:  "+imgCount);
		for (int j =0 ; j<5;j++) {
			System.out.println(images.get(j).getAttribute("src"));
			}
		driver.findElement(By.id("i21")).sendKeys("31");
		driver.findElement(By.id("i22")).sendKeys("05");
		driver.findElement(By.xpath("//input[@id='i23']")).sendKeys("1978");
		
		driver.findElement(By.xpath("//input[@name='but']")).click();
		
		String age = driver.findElement(By.xpath("//input[@id='r1']")).getAttribute("value");
		String days = driver.findElement(By.xpath("//input[@id='r4']")).getAttribute("value");
		String ageInHours = driver.findElement(By.xpath("//input[@id='r3']")).getAttribute("value");
		String ageInMinutes = driver.findElement(By.xpath("//input[@id='r2']")).getAttribute("value");
		
		System.out.println("Your age is: "+age);
		System.out.println("Your Age in Days: "+days);
		System.out.println("Your Age in Hours: "+ageInHours);
		System.out.println("Your Age in Minutes: "+ageInMinutes);
		
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
			
		}
	@AfterTest
	public void teardown() {
		driver.quit();	
}
}
