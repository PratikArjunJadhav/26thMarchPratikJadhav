package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywordsInvocationCount {
  @Test(invocationCount = 3)
  public void InvocationCount() {
	  
	   {
	  Reporter.log("Hello",true);
	  }
  
}
}