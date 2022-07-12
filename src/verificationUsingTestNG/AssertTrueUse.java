package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void myMethod() {
	  boolean a = true;
	  boolean b = false;
	  Assert.assertTrue(a, "TC is failed as value is false");
	  Reporter.log("TC is Passed as value is true",true);   // pass scenario
	  
	  Assert.assertTrue(b, "TC is failed as value is false");
	  Reporter.log("TC is Passed as value is true",true);   // fail scenario
  }
}
