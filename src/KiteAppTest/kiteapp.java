package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

		WebElement userId = driver.findElement(By.id("userid"));
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userId.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		loginButton.click();
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.id("pin"));
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(1000);
		
		pin.sendKeys("982278");
		continueButton.click();
		
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		Thread.sleep(500);
		String actualUserID = username.getText();
		String expectedUserID = "ELR321";
		if(actualUserID.equals(expectedUserID) )
		{
			System.out.println("User ID matching TC is PASSED");
		}
		else
		{
			System.out.println("User ID not matching TC is PASSED");
		}
		
		username.click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(100);
		driver.close();
	}

}
