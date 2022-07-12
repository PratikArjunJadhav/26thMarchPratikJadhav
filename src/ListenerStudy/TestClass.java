package ListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerStudy.Listener.class)
public class TestClass {
  @Test
  public void TC1()
	{
		Reporter.log("TC1 is Passed", true);
	}
  @Test
  public void TC2()
	{
	  Assert.fail();
		Reporter.log("TC2 is Passed", true);
		  
	}
  @Test(dependsOnMethods ="TC2")
  public void TC3()
	{
		Reporter.log("TC3 is Passed", true);
	}
}
