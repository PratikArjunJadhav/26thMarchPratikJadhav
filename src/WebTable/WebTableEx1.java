package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		// how to find no of rows in table
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table//tr"));
		
		int TotalNoOfRows = Rows.size();
		System.out.println("Total No of Rows in Table "+TotalNoOfRows);
		Thread.sleep(1000);
		// how to find no of columns in table
		List<WebElement> Columns = driver.findElements(By.xpath("//table//tr[1]//th"));
            
		int TotalNoOfColumns = Columns.size();
		System.out.println("Total No Of Columns in Table "+TotalNoOfColumns);
		
	}

}
