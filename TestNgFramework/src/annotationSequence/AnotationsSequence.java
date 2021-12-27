package annotationSequence;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotationsSequence {
	@Test
	@BeforeSuite
	public void bSuite() {
		Reporter.log("before suite", true);
	}
	@AfterSuite
	public void aSuite() {
		Reporter.log("after suite", true);
	}
	@BeforeTest
	public void bTest()
	{
		Reporter.log("before test", true);
	}
	@AfterTest
	public void aTest()
	{
		Reporter.log("after test", true);
	}
	@BeforeClass
	public void bClass()
	{
		Reporter.log("before class", true);
	}
	@AfterClass
	public void aClass()
	{
		Reporter.log("after class", true);
	}
	@BeforeMethod
	public void bMethod()
	{
		Reporter.log("before method", true);
	}
	@AfterMethod
	public void aMethod()
	{
		Reporter.log("after method", true);
	}
}
