package com.codemind.b5project.pages;

public class RegistrationPage {
	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import com.codemind.b1project.TestNgListners;

@Listeners(TestNgListners.class)
public class RegistrationPage {

	WebDriver driver;
	WebElement firstNameTestBox;
	WebElement submitButton;
	WebElement countyDropDown;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstNameTestBox() {
		return firstNameTestBox;
	}

	public void setFirstNameTestBox() {
		firstNameTestBox =driver.findElement(By.xpath("//input[@name='firstName']"));
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton() {
		submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
	}

	public WebElement getCountyDropDown() {
		return countyDropDown;
	}

	public void setCountyDropDown() {
		this.countyDropDown = driver.findElement(By.xpath("//select[@name='country']"));
	}


}


}
