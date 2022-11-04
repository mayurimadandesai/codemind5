package com.codemind.b5project;

public class TestNgListners {


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;




public class TestNgListners implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("Test case started " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case passed " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
	//	if (result.getStatus() == result.FAILURE) {
		//	try {
			//	UtilityMethods.getScreenShot(result.getName(),driver);
			//} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
		//	}
	//	}

		Reporter.log("Test case failed " + result.getName());

		
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


}
