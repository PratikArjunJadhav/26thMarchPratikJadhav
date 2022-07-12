package Miscellneous_Study;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	       List<WebElement> Links = driver.findElements(By.tagName("a"));
	       System.out.println(Links.size());
	       
	       Iterator<WebElement> it = Links.iterator();
	       while(it.hasNext())
	       {
	       System.out.println(it.next().getText());
	       }
	}
}
//	       //OUTPUT:25
//	       VELOCITY CORPORATE TRAINING CENTER
//	       HOME
//	       (Current)
//	       PRACTICE
//	       REGISTER NOW
//	       About Us
//	       Contact Us
//	       Open Tab
//	       REST API
//	       SoapUI
//	       Appium
//	       JMeter
//	       Dummy Content For Testing.
//	       Dummy Content For Testing.
//	       Dummy Content For Testing.
//	       Dummy Content For Testing.
//	       Dummy Content For Testing.
//	       Dummy Content For Testing.
//	       Dummy Content For Testing.
//	       Dummy Content For Testing.
//	       Facebook
//	       Twitter
//	       Google+
//	       Youtube

	


