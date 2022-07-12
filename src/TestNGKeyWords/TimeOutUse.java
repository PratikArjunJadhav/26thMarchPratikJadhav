package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  
	@Test(timeOut = 3000)
	  public void myTest1() throws InterruptedException
   {
	
		Thread.sleep(2000);
		Reporter.log("myTest1 is running",true);
    }
	
   @Test  
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
