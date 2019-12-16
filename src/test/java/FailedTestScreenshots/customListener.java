package FailedTestScreenshots;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListener extends base implements ITestListener{

	
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	 	  public void onTestSuccess(ITestResult result) {
	    // not implemented
	  }

	  public void onTestFailure(ITestResult result) {
	   
		  takeScreenshot(result.getMethod().getMethodName());
	  }

	  
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	
	  public void onFinish(ITestContext context) {
	    // not implemented
	  }
	}


