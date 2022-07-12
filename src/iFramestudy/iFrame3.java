package iFramestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		 Thread.sleep(1000);
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Im Frame1");
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(1000);
		 driver.switchTo().frame(1);
		 driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Im Frame2");
		 Thread.sleep(1000);
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(2);
		 driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Im Frame3");
		 Thread.sleep(1000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(1000);
		 driver.switchTo().frame(3);
		 driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Im Frame4");
		 driver.switchTo().defaultContent();
	     Thread.sleep(1000);
	     driver.switchTo().frame(2);
		 String text2 = driver.findElement(By.xpath("//p[text()='iframe inside frame:']")).getText();
		 System.out.println(text2);
		 driver.switchTo().defaultContent();
	     Thread.sleep(5000);
	     driver.switchTo().frame(2);
		 String text3 = driver.findElement(By.xpath("//div[text()='Form Filling Demo Page']")).getText();
		 System.out.println(text3);
	}

}
