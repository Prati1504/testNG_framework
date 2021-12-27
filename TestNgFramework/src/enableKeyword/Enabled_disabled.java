package enableKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_disabled {


	@Test(enabled=true)
	public void testcase1()
	{
		Reporter.log("test1",true);	
	}
	@Test(enabled=false)
	public void atestcase2()
	{
		Reporter.log("test2",true);}
	}
