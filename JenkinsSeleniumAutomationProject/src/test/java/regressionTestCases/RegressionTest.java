package regressionTestCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class RegressionTest extends TestBase
{

	@Test
	public void test()
	{
		driver .get("https://www.google.com");
	}
	
}
