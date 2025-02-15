package smokeTestCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class SmokeTest extends TestBase
{
	@Test
	public void test()
	{
		driver .get("https://www.google.com");
	}
}
