package com.codemind.b5project.pages;

public class HomePage {
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class HomePage {

		WebDriver driver;

		public HomePage(WebDriver driver) {
			this.driver = driver;
		}

		WebElement userName;
		WebElement password;
		WebElement loginButton;
		WebElement loginSuccessfullMsg;
		WebElement registerLink;


		public WebElement getUserName() {
			return userName;
		}

		public void setUserName() {
			userName = driver.findElement(By.xpath("//input[@name='userName']"));
		}

		public WebElement getPassword() {
			return password;
		}

		public void setPassword() {
			password = driver.findElement(By.xpath("//input[@name='password']"));
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public void setLoginButton() {
			loginButton = driver.findElement(By.xpath("//input[@name='submit']"));
		}

		public WebElement getLoginSuccessfullMsg() {
			return loginSuccessfullMsg;
		}

		public void setLoginSuccesfullMsg() {
			loginSuccessfullMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		}

		public WebElement getRegisterLink() {
			return registerLink;
		}

		public void setRegisterLink() {
			registerLink = driver.findElement(By.linkText("REGISTER"));
		}

	}





}
