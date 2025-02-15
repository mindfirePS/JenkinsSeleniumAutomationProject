package testBase;

import org.openqa.selenium.WebDriver;


public class TestBase 
{
	public static WebDriver driver = null ;
	
	public static String url = "https://opensource-demo.orangehrmlive.com/";
	
	public static String usernameInputBox_css = "input[name='username']";
	public static String passwordInputBox_css = "input[name='password']";
	public static String loginButton_xpath = "//button[@type='submit']";
	public static String dashboard_xpath = "//h6[text()='Dashboard']";
	public static String dashboarddd_css = "span.oxd-userdropdown-tab>i";
	public static String logout_xpath = "//a[text()='Logout']";
	
	
}
