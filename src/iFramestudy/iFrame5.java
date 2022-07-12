package iFramestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrame5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		 Thread.sleep(1000);
		String text1 = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples')]")).getText();
		 
		System.out.println(text1);
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Hello Good Afternoon");
		 Thread.sleep(1000);
		 driver.switchTo().defaultContent();
		 String text2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		 System.out.println(text2);
		 Thread.sleep(1000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(1000);
		 driver.switchTo().frame("frame2");
		WebElement str = driver.findElement(By.id("animals"));
		str.click();
		 Thread.sleep(500);
		Select s = new Select(str);
		s.selectByVisibleText("Big Baby Cat");
		 driver.switchTo().defaultContent();
	      Thread.sleep(3000);
	      
		 driver.switchTo().frame("frame2").switchTo().frame("frame3");
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 
		 
		
	}

}
