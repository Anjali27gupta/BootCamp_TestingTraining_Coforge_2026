package com.Easycalcul.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginEasyCal {

    WebDriver driver;

    public LoginEasyCal(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "idToken1")
    WebElement email;

    @FindBy(id = "idToken2")
    WebElement password;

    @FindBy(id = "loginButton_0")
    WebElement loginbtn;

    public void login_EasyCal(String uname, String pass) {
        email.sendKeys(uname);
        password.sendKeys(pass);
        loginbtn.click();
    }
}