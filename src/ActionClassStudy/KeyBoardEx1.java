package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act = new Actions(driver);
		
		act.click(day).perform();
		
		for(int i=1; i<=9; i++)
		{
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		 act.sendKeys(Keys.ENTER);
		 
		 
		 WebElement firstname = driver.findElement(By.name("firstname"));
		 firstname.sendKeys("Yogendra");
		 
		 
	  act.keyDown(firstname,Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("ratik").build().perform();
	}

}
