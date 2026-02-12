package com.CaseStudy.Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class TestNG_MultipleBrowser {
   String[] urls = {
           "https://opensource-demo.orangehrmlive.com/",
           "https://demo.opencart.com/",
           "http://www.bing.com",
           "https://www.freecrm.com/",
           "http://www.half.ebay.com"
   };
   
   @Test
   public void chromeTest() {
       WebDriver driver = new ChromeDriver();
       for (String url : urls) {
           driver.get(url);
           driver.manage().window().maximize();
           
           String title = driver.getTitle();
           String currentUrl = driver.getCurrentUrl();
           int titleLength = title.length();
           System.out.println("CHROME BROWSER");
           System.out.println("Page Title : " + title);
           System.out.println("Title Length : " + titleLength);
           System.out.println("Page URL : " + currentUrl);
           String actualURL = url;
           if (currentUrl.equals(actualURL)) {
               System.out.println("URL Verification PASSED");
           } else {
               System.out.println("URL Verification FAILED");
           }
       }
       driver.quit();
   }
   
   @Test
   public void firefoxTest() {
       WebDriver driver = new FirefoxDriver();
       for (String url : urls) {
           driver.get(url);
           driver.manage().window().maximize();
           String title = driver.getTitle();
           String currentUrl = driver.getCurrentUrl();
           int titleLength = title.length();
           System.out.println("FIREFOX BROWSER");
           System.out.println("Page Title : " + title);
           System.out.println("Title Length : " + titleLength);
           System.out.println("Page URL : " + currentUrl);
           String actualURL = url;
           if (currentUrl.equals(actualURL)) {
               System.out.println("URL Verification PASSED");
           } else {
               System.out.println("URL Verification FAILED");
           }
       }
       driver.quit();
   }
   
   @Test
   public void edgeTest() {
       WebDriver driver = new EdgeDriver();
       for (String url : urls) {
           driver.get(url);
           driver.manage().window().maximize();
           String title = driver.getTitle();
           String currentUrl = driver.getCurrentUrl();
           int titleLength = title.length();
           System.out.println("EDGE BROWSER");
           System.out.println("Page Title : " + title);
           System.out.println("Title Length : " + titleLength);
           System.out.println("Page URL : " + currentUrl);
           String actualURL = url;
           if (currentUrl.equals(actualURL)) {
               System.out.println("URL Verification PASSED");
           } else {
               System.out.println("URL Verification FAILED");
           }
       }
       driver.quit();
   }
}