package Miscellneous_Study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("honda");
        Thread.sleep(500);
     
         List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        Thread.sleep(500);
         System.out.println(searchresults.size());
        for(WebElement r:searchresults)
        {
        	 System.out.println(r.getText());
         }
        for(WebElement result:searchresults)// for clicking on required result
        {
        String actualText = result.getText();
        String expectedText = "honda amaze";
        if(actualText.equals(expectedText))
        {
        result.click();
        break;
        }
         
	}

        driver.findElement(By.linkText("Images")).click();
        
       List<WebElement> allImages = driver.findElements(By.tagName("img"));
       Thread.sleep(500);
         System.out.println(allImages.size());
        
}
}
