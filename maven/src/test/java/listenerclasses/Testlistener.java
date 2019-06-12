package listenerclasses;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Testlistener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.print(result.getName()+"methode started");
		
	}

	

	public void onTestSuccess(ITestResult result) {
		System.out.print(result.getName()+"successfully completed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.print(result.getName()+"test failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	


}
