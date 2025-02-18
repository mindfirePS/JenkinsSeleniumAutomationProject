package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class TestBase 
{
	public static WebDriver driver = null ;
	
	public static String url = "https://opensource-demo.orangehrmlive.com/";
	public static String correctUsername = "Admin";
	public static String correctPassword  = "admin123";
	public static String incorrectUsername = "Admin_w";
	public static String incorrectPassword  = "admin123_w";
	
	public static String usernameInputBox_css = "input[name='username']";
	public static String passwordInputBox_css = "input[name='password']";
	public static String loginButton_xpath = "//button[@type='submit']";
	public static String ohrmDashboardLogo_css = "div.oxd-brand-banner";
	public static String dashboarddd_css = "span.oxd-userdropdown-tab>i";
	public static String logout_xpath = "(//ul[@class='oxd-dropdown-menu']//li)[last()]//a";
	public static String usernameInputBoxRequired_xpath = "//input[@name='username']//ancestor::div[@class='oxd-form-row']//span[text()='Required']";
	public static String passwordInputBoxRequired_xpath = "//input[@name='password']//ancestor::div[@class='oxd-form-row']//span[text()='Required']";
	public static String invalidCredentials_css = "div.orangehrm-login-error>div>div>p";
	
	@BeforeTest
	public void LaunchBrowser()
	{
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
	}
	
	@AfterTest
	public void quitBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Browser Quited");
	}
	
	@BeforeMethod
	public void navigateToApp() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.get(url);
		System.out.println("Navigated to url : "+url);
	}


	
}
