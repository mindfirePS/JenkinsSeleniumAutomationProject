package sanityTestCases;

import org.testng.annotations.Test;

import testBase.TestBase;

public class SanityTest extends TestBase
{
	@Test
	public void test()
	{
		driver .get("https://www.google.com");
	}
}
