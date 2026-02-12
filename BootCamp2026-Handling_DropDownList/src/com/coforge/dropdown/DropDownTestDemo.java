// Wap in selenium using webdriver , count no of items in list box and print in console 
package com.coforge.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



import utility.Helper;

public class DropDownTestDemo {
	//make browser public
	public WebDriver driver;
	
	@Test
	public void FBlaunch() throws Exception {
		driver= Helper.startBrowser("Firefox");
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		WebElement Country_Dropdown = driver.findElement(By.id("country"));
		Select countrylist = new Select(Country_Dropdown);
		countrylist.selectByIndex(9); // India
		Thread.sleep(5000);
		
		WebElement option = countrylist.getFirstSelectedOption();
		String countryindex = option.getText();
		System.out.println(countryindex);
		
		List<WebElement> county_list = countrylist.getOptions();
		int total_county = county_list.size();
		System.out.println("Total Country's in dropdownlist : "+ total_county);
		
		for (WebElement ele: county_list) {
			String county_name = ele.getText();
			System.out.println("Country Names : "+ county_name);
			
		}
		driver.quit();
	}
	

}
