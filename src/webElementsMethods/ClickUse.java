package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUse {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\.chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[ @value='Radio4']")).click();
		 
	}

}
