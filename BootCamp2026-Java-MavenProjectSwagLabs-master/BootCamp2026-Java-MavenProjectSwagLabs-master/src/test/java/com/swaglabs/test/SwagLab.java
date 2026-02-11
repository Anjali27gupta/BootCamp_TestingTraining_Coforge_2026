package com.swaglabs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.Reusability;
import utility.Helper;



public class SwagLab {
	public WebDriver driver;

    @Test(dataProvider = "SwagLabsData")
    public void loginTest(String userName, String password) throws Exception {

    	driver = Helper.startBrowser("Firefox");
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        Reusability.capturedScreenShot(driver, "Step1_Login_Page");

        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("inventory")) {

            Assert.assertTrue(currentUrl.contains("inventory"),
                    "Login Successful – Inventory page displayed");

            Reusability.capturedScreenShot(driver, "Step2_Login_Success");;

            driver.findElement(By.id("react-burger-menu-btn")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("logout_sidebar_link")).click();
            Thread.sleep(2000);

            String loginButtonText = driver.findElement(By.id("login-button")).getAttribute("value");
            Assert.assertEquals(loginButtonText, "Login");

            Reusability.capturedScreenShot(driver, "Step3_Logout_Success");
        } 
        driver.quit();
    }
    @DataProvider(name = "SwagLabsData")
    public Object[][] getData() {

        Object[][] data = new Object[3][2];

        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";

        data[1][0] = "problem_user";
        data[1][1] = "secret_sauce";

        data[2][0] = "visual_user";
        data[2][1] = "secret_sauce";

        return data;
    }
}
