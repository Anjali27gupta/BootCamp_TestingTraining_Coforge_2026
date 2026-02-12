// WAP using Selenium driver
// count no of radio buttons in easemytrip and also print text of radio buttons
package com.radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class RadioButtonsDemoUsingCmds {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Helper.startBrowser("Chrome");
        driver.get("https://www.easemytrip.com/");
        Thread.sleep(5000);

        List<WebElement> radioButtons =
                driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("Total number of radio buttons: " + radioButtons.size());

        for (int i = 0; i < radioButtons.size(); i++) {

            WebElement radio = radioButtons.get(i);

            String text = radio.getAttribute("value");

            System.out.println("Radio Button " + (i + 1) + " Text: " + text);
        }

        driver.quit();
    }
}
