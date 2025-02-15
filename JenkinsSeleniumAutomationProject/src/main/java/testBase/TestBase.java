package testBase;

import org.openqa.selenium.WebDriver;


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
	public static String dashboard_xpath = "//h6[text()='Dashboard']";
	public static String dashboarddd_css = "span.oxd-userdropdown-tab>i";
	public static String logout_xpath = "//a[text()='Logout']";
	public static String usernameInputBoxRequired_xpath = "//input[@name='username']//ancestor::div[@class='oxd-form-row']//span[text()='Required']";
	public static String passwordInputBoxRequired_xpath = "//input[@name='password']//ancestor::div[@class='oxd-form-row']//span[text()='Required']";
	public static String invalidCredentials_css = "div.orangehrm-login-error>div>div>p";
}
