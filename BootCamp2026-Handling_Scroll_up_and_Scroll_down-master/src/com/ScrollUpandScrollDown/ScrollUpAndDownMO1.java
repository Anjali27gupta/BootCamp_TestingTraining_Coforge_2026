/*
1. Create selenium java program using JavaScriptExecutor
2. Use Chrome, Firefox and Edge browser
3. Scroll down and scroll up
4. Take screenshot for scroll down and scroll up
5. Use TestNG framework
*/

package com.ScrollUpandScrollDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.Reusability;
import utility.Helper;

public class ScrollUpAndDownMO1 {

    WebDriver driver;
    String url = "https://www.easemytrip.com/";

    @BeforeTest
    public void setup() {

        driver = Helper.startBrowser("Chrome");

        driver.manage().window().maximize();
    }

    @Test
    public void scrollTest() throws Exception {

        driver.get(url);
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(3000);
        Reusability.capturedScreenShot(driver, "Scroll_Down");

        js.executeScript("window.scrollBy(0,-1200)");
        Thread.sleep(3000);
        Reusability.capturedScreenShot(driver, "Scroll_Up");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
