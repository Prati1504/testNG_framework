package groupsInTestNg;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnersInTestNg.ITestListner.class)
public class GroupsTestCases {

	@Test(groups="sanity")
	public void sanity1()
	{
		System.out.println("sanity running");
	}
	
	@Test(groups="retesting")
	public void retesting1()
	{
		System.out.println("retesting running");
		Assert.assertEquals(false, true);
	}
	
	@Test(groups="sanity")
	public void sanity2()
	{
		System.out.println("sanity running");
	}

	@Test(groups="retesting")
	public void  retesting2()
	{
		System.out.println("retesting running");
	}
}
