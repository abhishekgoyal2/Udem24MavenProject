package Academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerScreen implements ITestListener{

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("Test Finished"+result.getName());
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("on Test Started"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on Test Failed within succes percent"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		BaseUd b=new BaseUd();
		System.out.println("on Test Failure"+result.getName());
		
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on Test Skipped"+result.getName());
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("on Test success");
	}

}
