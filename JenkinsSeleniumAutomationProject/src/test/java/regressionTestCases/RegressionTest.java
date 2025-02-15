package regressionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import testBase.TestBase;

public class RegressionTest extends TestBase
{
	public static WebDriver driver = new FirefoxDriver();
	
	public static String correctUsername = "Admin";
	public static String correctPassword  = "admin123";

	
	@Test(groups= {"Regression_TC_001"})
	public void verify_login_is_successful_with_correct_credentials() throws InterruptedException
	{
		System.out.println("Browser Launched");
		
		driver.get(url);
		System.out.println("Navigated to url : "+url);
		
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
		
		driver.quit();
		System.out.println("Browser Quited");
	}
	
}
