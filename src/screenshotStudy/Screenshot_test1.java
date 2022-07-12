package screenshotStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_test1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinatuion = new File("C:\\Users\\HP\\Desktop\\class data\\Selenium\\screenshot\\.screentshot.png");
		FileHandler.copy(source, destinatuion);
		
	}

}
