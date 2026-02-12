package com.MouseMovementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.Reusability;
import utility.Helper;

public class MouseMovementConcept {

    public WebDriver driver;

    @Test
    public void mouseHoverTest() throws Exception {

        driver = Helper.startBrowser("Chrome");
        driver.manage().deleteAllCookies();
        driver.get("https://www.easemytrip.com/");

        Reusability.capturedScreenShot(driver, "1. Launch Application");

        Actions action = new Actions(driver);

        action.moveToElement(
                driver.findElement(By.xpath("//span[normalize-space()='Login or Signup']"))
        ).build().perform();

        Thread.sleep(3000);

        driver.findElement(
                By.xpath("//span[normalize-space()='Customer Login']"))
                .click();

        Reusability.capturedScreenShot(driver, "2. Customer Login Page");

        Thread.sleep(3000);
        driver.quit();
    }
}
