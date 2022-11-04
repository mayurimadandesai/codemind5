package com.codemind.b5project.TestCases;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codemind.b1project.UtilityMethods;
import com.codemind.b1project.pages.HomePage;
import com.codemind.b1project.pages.RegistrationPage;


//@Listeners(TestNgListners.class)
public class RegistrationTestCases {


	WebDriver driver;
	HomePage homePage;
	RegistrationPage registrationPage ;


	@BeforeMethod
	public void initilizeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\selenium\\\\New folder\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void verifySuccessfullRegistration(){

		homePage = new HomePage(driver);
		registrationPage=new RegistrationPage(driver);
		driver.get(UtilityMethods.getProperty("url"));
		homePage.setRegisterLink();
		homePage.getRegisterLink().click();
		UtilityMethods.waitForPageTitle(driver, 5,"Mercury Tours" );
		registrationPage.setFirstNameTestBox();
		registrationPage.getFirstNameTestBox().sendKeys("Abc");
		registrationPage.setCountyDropDown();
		UtilityMethods.selectvalueFromDropDownCommingUnderSelectTag(registrationPage.getCountyDropDown(),"INDIA");
		registrationPage.setSubmitButton();
		registrationPage.getSubmitButton().click();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			try {
				UtilityMethods.getScreenShot(result.getName()+ System.currentTimeMillis(),driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		driver.quit();
	}


}
