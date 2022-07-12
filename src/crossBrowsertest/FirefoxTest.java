package crossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void myMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
	   WebDriver driver = new FirefoxDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
  }
}
