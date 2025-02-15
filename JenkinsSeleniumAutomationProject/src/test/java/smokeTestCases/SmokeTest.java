package smokeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.TestBase;

public class SmokeTest extends TestBase
{
	
	@BeforeTest
	public void LaunchBrowser()
	{
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
	}

	@AfterTest
	public void quitBrowser()
	{
		driver.quit();
		System.out.println("Browser Quited");
	}

	@BeforeMethod
	public void navigateToApp()
	{
		driver.get(url);
		System.out.println("Navigated to url : "+url);
	}



	@Test(groups= {"Smoke_TC_001"})
	public void verify_login_is_successful_with_correct_credentials() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(usernameInputBox_css)).sendKeys(correctUsername);
		System.out.println("Username entered is : "+correctUsername);

		driver.findElement(By.cssSelector(passwordInputBox_css)).sendKeys(correctPassword);
		System.out.println("Password entered is : "+correctPassword);

		driver.findElement(By.xpath(loginButton_xpath)).click();
		System.out.println("Login button is clicked");

		Thread.sleep(2000);
		driver.findElement(By.xpath(dashboard_xpath)).isDisplayed();
		System.out.println("Dashboard is displayed");

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(dashboarddd_css)).click();
		System.out.println("Drop Down option button is clicked");

		driver.findElement(By.xpath(logout_xpath)).click();
		System.out.println("Logout option is clicked");

		Thread.sleep(2000);
		driver.findElement(By.xpath(loginButton_xpath)).isDisplayed();
		System.out.println("Login button is Displayed");

	}
}
