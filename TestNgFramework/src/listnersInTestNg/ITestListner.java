package listnersInTestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ITestListner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("########################################", true);
		Reporter.log(" begining of new test", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@", true);
		Reporter.log("test is successfully passes", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", true);
		Reporter.log("test fails", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS", true);
		Reporter.log("test skipped", true);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO", true);
		Reporter.log("on start", true);

	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", true);
		Reporter.log("on start", true);

	}
	

}
