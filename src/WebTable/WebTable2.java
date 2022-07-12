package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		List<WebElement> NoOfRows = driver.findElements(By.xpath("//table//tr"));
          System.out.println("Total No Of Rows are "+NoOfRows.size());
          
          // for reading all the rows we use for loop
          
          for(WebElement Read :NoOfRows)
          {
        	  System.out.print(Read.getText());
        	  System.out.println();
          }
          
          
		
		
	}

}
