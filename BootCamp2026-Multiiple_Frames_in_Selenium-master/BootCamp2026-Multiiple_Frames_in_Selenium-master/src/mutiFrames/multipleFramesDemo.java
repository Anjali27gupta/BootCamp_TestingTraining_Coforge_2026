package mutiFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import library.Reusability;
import utility.Helper;

public class multipleFramesDemo {

    public WebDriver driver;

    @Test
    public void Frames() {

        driver = Helper.startBrowser("Chrome");
        driver.navigate().to("file:///C:/Multiple%20Frames/IFrames.html");
        Reusability.capturedScreenShot(driver, "1. Launch Application");

        int totalNoofFrames = driver.findElements(By.tagName("iframe")).size();
        System.out.println("No of frames: " + totalNoofFrames);

        driver.switchTo().frame("EasyCalculation");
        driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("log_email")).sendKeys("9740673180");
        driver.findElement(By.id("log_password")).sendKeys("raghuBN@123");
        driver.findElement(By.xpath("//input[@name='log_submit']")).click();
        Reusability.capturedScreenShot(driver, "1. Launch Application");

        driver.navigate().to("file:///C:/Multiple%20Frames/IFrames.html");
        driver.findElement(By.xpath("/html/body/a")).click();

        driver.navigate().to("https://www.selenium.dev/");
        driver.findElement(By.xpath("//span[normalize-space()='Documentation']")).click();
        Reusability.capturedScreenShot(driver, "1. Launch Application");

        driver.navigate().to("file:///C:/Multiple%20Frames/IFrames.html");

        driver.switchTo().frame("Swag Labs");
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.xpath("/html/body")).click();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Reusability.capturedScreenShot(driver, "1. Launch Application");

        driver.quit();
    }
}
