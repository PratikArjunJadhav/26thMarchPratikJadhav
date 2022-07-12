package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalseUse {
  @Test
  public void myMethod() {
	  boolean a = true;
	  boolean b= false;
	  Assert.assertFalse(b, "TC is failed as value is true");
	  Reporter.log("TC is Passed as value is false",true);  // pass scenario
	  
	  Assert.assertFalse(a,"TC is failed as value is true");
	  Reporter.log("TC is Passed as value is false",true);  // fail scenario
  }
}
