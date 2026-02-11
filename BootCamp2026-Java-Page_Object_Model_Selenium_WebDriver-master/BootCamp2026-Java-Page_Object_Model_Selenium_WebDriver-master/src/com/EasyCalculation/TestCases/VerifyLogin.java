package com.EasyCalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalcul.Pages.LoginEasyCal;

import library.Reusability;
import utility.Helper;

public class VerifyLogin {

    public WebDriver driver;

    @Test
    public void CheckValidUser() {

        driver = Helper.startBrowser(
                "chrome",
                "https://accounts.saucelabs.com/am/XUI/#login/"
        );

        Reusability.capturedScreenShot(driver, "Step1_SauceLabs_Login_Page");

        LoginEasyCal loginPageEasyCal =
                PageFactory.initElements(driver, LoginEasyCal.class);

        loginPageEasyCal.login_EasyCal(
                "standard_user",
                "secret_sauce"
        );

        Reusability.capturedScreenShot(driver, "Step2_After_Login");
    }
}
