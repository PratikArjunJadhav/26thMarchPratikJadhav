package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
	
	@Test
		  public void myTest1()
	  {
			
			Reporter.log("myTest1 is running",true);
	  }
		
	@Test  (enabled = false )
		public void myTest2() 
	  {
			
			Reporter.log("myTest2 is running",true);
	  }
		
	@Test
		public void myTest3() 
	 {
			Reporter.log("myTest3 is running",true);
	 }
}
