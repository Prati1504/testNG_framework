package reporterClass;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class ReporterTest {

	@Test
	public void testCaseCheck()
	{
		Reporter.log("checking Reporter",true);
	}
}
