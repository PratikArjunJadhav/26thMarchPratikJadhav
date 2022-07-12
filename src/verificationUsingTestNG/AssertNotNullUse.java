package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNullUse {
  @Test
  public void myMethod() {
	  
	  String a="Jadhav";
	  String b= null;
	  
	  Assert.assertNotNull(a,"TC is failed as value is null");
	  Reporter.log("TC is Passed as value is Not Null");
	  //==================================================Pass Scenario
	  
//	  Assert.assertNotNull(b,"TC is failed as value is null");
//	  Reporter.log("TC is Passed as value is Not Null");
	  //==================================================Fail Scenario
  }
}
