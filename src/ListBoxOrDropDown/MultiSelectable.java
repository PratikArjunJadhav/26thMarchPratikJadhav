package ListBoxOrDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement multiSelectElement = driver.findElement(By.name("cars"));
		Select s = new Select(multiSelectElement);
		
		System.out.println("Multi select status is "+s.isMultiple());
		
       s.selectByValue("volvo");
         Thread.sleep(200);
        s.selectByIndex(2);
         Thread.sleep(200);
         s.selectByVisibleText("Saab");
         Thread.sleep(200);
         s.selectByIndex(3);
         
         Thread.sleep(300);
//         
//         s.deselectAll();
//         Thread.sleep(200);
//         s.deselectByIndex(0);
//         Thread.sleep(200);
//         s.deselectByValue("opel");
//         Thread.sleep(200);
//         s.deselectByIndex(1);
//         s.deselectByVisibleText("Audi");
         
         System.out.println(s.getFirstSelectedOption().getText());
	}
	

}
