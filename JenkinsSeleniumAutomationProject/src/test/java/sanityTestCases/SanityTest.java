package sanityTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.TestBase;

public class SanityTest extends TestBase
{
	
	@Test(groups= {"Sanity_TC_001"})
	public void verify_login_is_unsuccessful_with_no_credentials() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(loginButton_xpath)).click();
		System.out.println("Login button is clicked");

		Thread.sleep(2000);
		driver.findElement(By.xpath(usernameInputBoxRequired_xpath)).isDisplayed();
		System.out.println("Required warning is shown under username input text box");

		Thread.sleep(2000);
		driver.findElement(By.xpath(passwordInputBoxRequired_xpath)).isDisplayed();
		System.out.println("Required warning is shown under password input text box");
	}

	@Test(groups= {"Sanity_TC_002"})
	public void verify_login_is_unsuccessful_with_correctUsername_and_incorrectPassword() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(usernameInputBox_css)).sendKeys(correctUsername);
		System.out.println("Username entered is : "+correctUsername);

		driver.findElement(By.cssSelector(passwordInputBox_css)).sendKeys(incorrectPassword);
		System.out.println("Password entered is : "+incorrectPassword);

		driver.findElement(By.xpath(loginButton_xpath)).click();
		System.out.println("Login button is clicked");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(invalidCredentials_css)).isDisplayed();
		System.out.println("Invalid credentials warning is Displayed");
	}
	
	@Test(groups= {"Sanity_TC_003"})
	public void verify_login_is_unsuccessful_with_incorrectUsername_and_correctPassword() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(usernameInputBox_css)).sendKeys(incorrectUsername);
		System.out.println("Username entered is : "+incorrectUsername);

		driver.findElement(By.cssSelector(passwordInputBox_css)).sendKeys(correctPassword);
		System.out.println("Password entered is : "+correctPassword);

		driver.findElement(By.xpath(loginButton_xpath)).click();
		System.out.println("Login button is clicked");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(invalidCredentials_css)).isDisplayed();
		System.out.println("Invalid credentials warning is Displayed");	
	}
	
	@Test(groups= {"Sanity_TC_004"})
	public void verify_login_is_unsuccessful_with_incorrect_credentials() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(usernameInputBox_css)).sendKeys(incorrectUsername);
		System.out.println("Username entered is : "+incorrectUsername);

		driver.findElement(By.cssSelector(passwordInputBox_css)).sendKeys(incorrectPassword);
		System.out.println("Password entered is : "+incorrectPassword);

		driver.findElement(By.xpath(loginButton_xpath)).click();
		System.out.println("Login button is clicked");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(invalidCredentials_css)).isDisplayed();
		System.out.println("Invalid credentials warning is Displayed");
	}
	
	@Test(groups= {"Sanity_TC_005"})
	public void verify_login_is_unsuccessful_with_entering_only_username() throws InterruptedException
	{	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(usernameInputBox_css)).sendKeys(correctUsername);
		System.out.println("Username entered is : "+correctUsername);
				
		driver.findElement(By.xpath(loginButton_xpath)).click();
		System.out.println("Login button is clicked");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(passwordInputBoxRequired_xpath)).isDisplayed();
		System.out.println("Required warning is shown under password input text box");	
	}
	
	@Test(groups= {"Sanity_TC_005"})
	public void verify_login_is_unsuccessful_with_entering_only_password() throws InterruptedException
	{		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(passwordInputBox_css)).sendKeys(correctPassword);
		System.out.println("Password entered is : "+correctPassword);
				
		driver.findElement(By.xpath(loginButton_xpath)).click();
		System.out.println("Login button is clicked");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(usernameInputBoxRequired_xpath)).isDisplayed();
		System.out.println("Required warning is shown under username input text box");
	}
	
}
