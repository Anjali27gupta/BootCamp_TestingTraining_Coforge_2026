package com.LearnFrameWork.Pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "log_email")
	WebElement email;
	
	@FindBy(name = "log_password")
	WebElement password;
	
	@FindBy(xpath = "//input[contains(@name,'log_submit')]")
	WebElement loginbtn;
 
public void login_EasyCal(String Uname, String Psd) {
	email.sendKeys(Uname);
	password.sendKeys(Psd);
	loginbtn.click();
	
	}	
 
}