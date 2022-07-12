package DynamicElementsHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpcartReviews {

	public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.name("q")).click();
			Thread.sleep(500);
			driver.findElement(By.name("q")).sendKeys("One plus");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);
		    List<WebElement> reviewEl = driver.findElements(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		    Thread.sleep(3000);
		    Iterator<WebElement> it = reviewEl.iterator();
			                
			                while(it.hasNext())
			                {
			                	System.out.println(it.next().getText());
			                }
			                
				}

}
