package com.LearnFrameWork.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.LearnFrameWork.Pages.BaseClass;
import com.LearnFrameWork.Pages.LoginPage;

import utility.ExcelDataReader;

public class LoginOrganHRM extends BaseClass {
	@Test
	public void loginApp() throws InterruptedException {
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("LoginHRM", 0, 0);
		LoginPage loginHRM = PageFactory.initElements(driver,LoginPage.class);
		loginHRM.login_EasyCal(excel.getStringData("LoginHRM", 0, 0),excel.getStringData("LoginHRM",0,1));
		Thread.sleep(5000);
	}	
}