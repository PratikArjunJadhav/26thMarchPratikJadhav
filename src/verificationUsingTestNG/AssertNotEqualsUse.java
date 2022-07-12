package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqualsUse {
  @Test
  public void myMethod() {
	  
	  String a ="Pune";
	  String b ="Pune1";
	  
	  Assert.assertNotEquals(a, b, "a and b values are matching TC Failed");
	  Reporter.log("a and b values are not matching TC Passed",true);
  }

	  
}
