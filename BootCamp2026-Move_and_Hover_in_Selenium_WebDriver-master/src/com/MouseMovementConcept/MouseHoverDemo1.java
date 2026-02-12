// WAP using selenium with java
// 1) use testNG framework
// 2) user can choose any browser based on his interest
// 3) url should be https://www.spicejet.com/
// 4) move hand hover on "Add-ons"
// 5) print content present in Add-on
// 6) click on student discount
// 7) take screenshot wherever is required
// 8) push code to github 
// 9) run and validate

package com.MouseMovementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.Reusability;
import utility.Helper;

import java.util.List;

public class MouseHoverDemo1 {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = Helper.startBrowser("Chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void mouseHoverTest() throws Exception {

        driver.get("https://www.spicejet.com/");
        Thread.sleep(5000);
        Reusability.capturedScreenShot(driver, "1_Launch_Application");

        Actions action = new Actions(driver);
        WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));
        action.moveToElement(addons).perform();
        Thread.sleep(3000);

        List<WebElement> addOnLinks =
                driver.findElements(By.xpath("//div[text()='Add-ons']/following::div//a"));

        System.out.println("Add-ons options are:");
        for (WebElement ele : addOnLinks) {
            System.out.println(ele.getText());
        }

        driver.findElement(By.xpath("//div[text()='Student Discount']")).click();
        Thread.sleep(3000);
        Reusability.capturedScreenShot(driver, "2_Student_Discount_Clicked");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
