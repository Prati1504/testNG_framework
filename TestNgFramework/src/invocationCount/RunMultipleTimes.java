package invocationCount;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RunMultipleTimes {


	@Test(invocationCount=3)
	public void testcase1()
	{
		Reporter.log("test1",true);	
	}
	@Test(invocationCount=1)
	public void atestcase2()
	{
		Reporter.log("test2",true);	
	}
}
