package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;



public class Listener implements ITestListener
{
	
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC2 is Failed so take screenshot",true);
	}
	
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC1 is passed",true);
	}
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC3 test is skipped",true);
	}

}
