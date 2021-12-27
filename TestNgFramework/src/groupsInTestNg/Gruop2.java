package groupsInTestNg;

import org.testng.annotations.Test;

public class Gruop2 {


	@Test(groups="sanity")
	public void sanity3()
	{
		System.out.println("sanity running");
	}
	
	@Test(groups="retesting")
	public void retesting3()
	{
		System.out.println("retesting running");
	}
	
	@Test(groups="sanity")
	public void sanity4()
	{
		System.out.println("sanity running");
	}

	@Test(groups="retesting")
	public void  retesting4()
	{
		System.out.println("retesting running");
	}
}
