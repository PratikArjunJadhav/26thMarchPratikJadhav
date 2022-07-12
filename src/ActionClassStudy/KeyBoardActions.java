package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
         WebElement textBox = driver.findElement(By.id("autocomplete"));
        // textBox.sendKeys("Good Morning");   //using WebElement method
         
       //How to send keys using Actions Class
       //Create object of Actions class and pass driver object
         Actions act = new Actions(driver);
         
      // using sendKeys method of actions class perform SendKeys task
         
         act.sendKeys(textBox, "Text By Actions Class").perform();
         
       //How to handle drop down using Actions Class
         
        // driver.findElement(By.name(""))
         
         
         WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
         
         act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
         
         
         
	}

}
