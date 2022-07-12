package PopupsStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		String mainpageID = driver.getWindowHandle();//id of main page
		System.out.println(mainpageID);
		System.out.println("============================");
		
		//to open child window
		
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(1000);
		
		//to handle multiple windows/ to get multiple ids
		Set<String> allPageID = driver.getWindowHandles();
		Iterator<String> it = allPageID.iterator();
		
//		while (it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		 
		String mainPageID = it.next();//will return main page id
		String childPageID = it.next();//will return child page id
		Thread.sleep(1000);
		//to switch focus to child window
		driver.switchTo().window(childPageID);// changing focus from main page to child page
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subscribe-field-1']")).sendKeys("Selenium Practice");
		

	}

}
