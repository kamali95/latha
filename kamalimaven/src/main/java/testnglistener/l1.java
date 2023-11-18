package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class l1 implements ITestListener{
	//ITestListener=>interface =>on start, on finish
    //right click =>source=>over ride/implements method

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}
	
	
	
	
	
	
	
}
