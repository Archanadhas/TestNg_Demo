package abc;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	public void onFinish(ITestContext arg0)
	{
		
	}
	public void onStart(ITestContext arg0) {
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}
	public void onTestFailure(ITestResult arg0) {
		
	}
	public void onTestSkipped(ITestResult arg0) {
		
	}
	public void onTestStart(ITestResult arg0) {
		System.out.println("Run");
	}
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Successfully");
	}

}
