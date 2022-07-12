package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorWithoutsendkey {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	
		   driver.get("https://www.inviul.com");
		  
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  
		  //Javascript command
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  String text = js.executeScript("return document.getElementById('site-header').innerHTML").toString();
		  System.out.println("Text on hompage is- "+text );
		  	  
		  Thread.sleep(5000);
		  
//		  driver.close();
//		  
//		  driver.quit();
//	
		}

}
