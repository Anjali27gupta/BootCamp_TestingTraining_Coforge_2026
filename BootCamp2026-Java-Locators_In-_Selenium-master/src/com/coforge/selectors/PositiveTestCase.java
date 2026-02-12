/*
Test case 1: Positive Login test
Open page
Type username student into Username field
Type password Password123 into Password field
Push Submit button
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page
*/

package com.coforge.selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTestCase {

    WebDriver driver;

    @Test
    public void IDTest() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        String currentUrl = driver.getCurrentUrl();
        String originalUrl = "https://practicetestautomation.com/practice-test-login/";

        if (currentUrl.equals(originalUrl)) {
            System.out.println("login failed");
        } else {
            System.out.println("login successful");
        }

        driver.quit();
    }
}
