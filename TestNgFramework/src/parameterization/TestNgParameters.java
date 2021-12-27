package parameterization;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameters {
	@Test
	@Parameters({"browser","version"})
	public void checkPara(String Browser, String Version)
	{
		if(Browser.equalsIgnoreCase("chrome")) {
			Reporter.log("chrome is running", true);
			Reporter.log("chrome version is running :" + Version, true);
			}
		else if(Browser.equalsIgnoreCase("ff"))
			Reporter.log("ff is running", true);

	}
}
