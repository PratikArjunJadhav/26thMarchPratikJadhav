package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  
	@Test(priority = -2)
	
  public void myTest1() {
		
		Reporter.log("myTest1 is running",true);
  }
	
	@Test(priority = -3 )
	public void myTest2() {
		
		Reporter.log("myTest2 is running",true);
	}
	
	@Test(priority = 0)
	public void myTest3() {
		Reporter.log("myTest3 is running",true);
	}
}
