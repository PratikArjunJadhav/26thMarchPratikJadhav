package waits_selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
	
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(1000));
		
		WebElement aboutUs = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
					
         wait.until(ExpectedConditions.visibilityOf(aboutUs));
         
         aboutUs.click();
         
         
	}

}
