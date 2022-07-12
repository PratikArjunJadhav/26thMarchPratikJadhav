package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerficaionUse {
  @Test
  public void myMethod() {
	  
	  String a = "Pune";
	  String b = "Pune";
	  
	  Assert.assertNotEquals(a, b, "TC is failed as value is Not Equal");
	  
	  Assert.assertNull(b, "TC is failed as value is Not Null");
	  
	  //In case of Hard Assertations we can not verify multiple points in single class i.e. limitation of Hard Assertation
	 // hence we require Soft Asseratations
  }
}
