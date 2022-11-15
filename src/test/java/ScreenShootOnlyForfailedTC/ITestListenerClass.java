package ScreenShootOnlyForfailedTC;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseClass implements ITestListener{

	public void onTestFailure(ITestResult result) {
		CaptureScreenShot(result.getMethod().getMethodName()+".jpg");
	}
	

}
