package DynamicElementsHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ratings {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).click();
		Thread.sleep(500);
		driver.findElement(By.name("q")).sendKeys("Vivo T1 5G");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		List<WebElement> Reviews = driver.findElements(By.xpath("(//div[@class='col col-7-12'])[1]//span[3]"));
		
		//System.out.println(Reviews);
		Thread.sleep(4000);
		Iterator<WebElement> it = Reviews.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next().getText());
        }
	}

}
