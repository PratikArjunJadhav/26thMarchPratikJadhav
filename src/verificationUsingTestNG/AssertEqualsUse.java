package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod() {
	  
	  String a ="Pune";
	  String b ="Pune";
	  
	  Assert.assertEquals(a, b, "a and b values are not matching TC failed");//assertEquals(a,b,"String error message")
	  Reporter.log("a and b values are matching TC PASSED",true);
	  
	  
	   }
}
