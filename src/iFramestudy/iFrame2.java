package iFramestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

		String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
		 System.out.println(text);
		 
			driver.switchTo().frame(0);//changing focus from main page to frame1
			Thread.sleep(2000);
			String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
			System.out.println(text1);
			
			Thread.sleep(2000);
			
		driver.switchTo().defaultContent();
		 String text2 = driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(text2);
		 
			Thread.sleep(2000);
			
			driver.switchTo().frame(1);
		  String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
		  System.out.println(text3);
		  
		 
		  
	}
}
