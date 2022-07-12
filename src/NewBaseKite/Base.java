package NewBaseKite;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import NewUtilityProp.NewUtilityProp;

public class Base {
	 protected WebDriver driver;
	
	public void openChromeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(NewUtilityProp.getDataFromPropFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public void openFirefoxBrowser() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(NewUtilityProp.getDataFromPropFile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	
    
	
}
