package FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class seleniumcode {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.findElement(By.xpath("//input [@id ='autocomplete']")).click();
		//driver.findElement(By.xpath("//input [@id='autocomplete']")).sendKeys("Hey Pratik");
		//driver.findElement(By.xpath("// h1[text() = 'Welcome To Practice Page']"));
		//driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
		//driver.findElement(By.xpath("//input[contains(@class,'ui-autocomplete-input')]"));
		driver.findElement(By.xpath("(//input[@type = 'radio'] )[3]"));
		
	}

}
