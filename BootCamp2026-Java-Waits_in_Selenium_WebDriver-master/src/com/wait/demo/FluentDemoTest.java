package com.wait.demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import utility.Helper;

public class FluentDemoTest {

	public static void main(String[] args) {
		
		WebDriver driver = Helper.startBrowser("Chrome");
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);

			   WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver lDriver) {
			    	 WebElement element = lDriver.findElement(By.xpath("//p[@id='demo']"));
			    	 String eleText = element.getText();
			    	 
			    	 if(eleText.equalsIgnoreCase("WebDriver")) {
			    		 System.out.println("text found");
			    		 return element;
			    	 }else {
			    		 System.out.println("Still waiting - Current text is "+eleText);
			    		 return null;
			    	 }
			     }
			   });
			   System.out.println("Element status - Current text is "+ele.isDisplayed());
	}

}
