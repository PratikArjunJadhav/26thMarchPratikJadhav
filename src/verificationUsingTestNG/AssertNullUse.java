package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod() {
	  
	  String a = null;
	  String b ="Pratik";
//	  Assert.assertNull(a, "TC is failed as value is not null");
//	  Reporter.log("TC is Passed as value is NUll");
	  //==============================================Pass scenario
	  
	  Assert.assertNull(b, "TC is failed as value is not null");
	  Reporter.log("TC is Passed as value is NUll",true);
	  //==================================================Fail scenario
  }
}
