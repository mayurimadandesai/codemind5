package com.codemind.b3project.TestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; 


import com.codemind.b3project.pages.HomePage;
import com.codemind.b3project.pages.RegistrationPage;
import com.codemind.b3project.utility.UtilityMethods;

//@Listeners(TestNgListner.class)
public class RegistrationTestcases {
	WebDriver driver;
	HomePage homePage;
	RegistrationPage registrationPage;

	@BeforeMethod
	public void initilizeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\New folder\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test
	public void verifySuccessfullRegistration() {
		homePage = new HomePage(driver);
		registrationPage = new RegistrationPage(driver);
		driver.get(UtilityMethods.getProperty("url"));
		homePage.setRegisterLink();
		homePage.getRegisterLink().click();
		UtilityMethods.waitForPageTitle(driver, 5, "Register: Mercury Tours");
		registrationPage.setFirstNameTextBox();
		registrationPage.getFirstNameTextBox().sendKeys("sachin");
		registrationPage.setCountryDropDown();
		UtilityMethods.selectValueFromDropDownCommingUnderSelectTag(registrationPage.getCountryDropDown(), "INDIA");
		registrationPage.setSubmitButton();
		registrationPage.getSubmitButton().click();
		registrationPage.setRegistrationSuccessfullMsg();
		String msg = registrationPage.getRegistrationSuccessfullMsg().getText();
		assertTrue(msg.contains("sachin"));

	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			try {
				UtilityMethods.getScreenShot(result.getName() + System.currentTimeMillis(), driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.quit();
	}

}

