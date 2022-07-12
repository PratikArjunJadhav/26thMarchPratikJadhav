package CSSSelectorUse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UseOFcss {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.tutorialspoint.com/index.htm";
	driver.get(url);
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //getting color attribute with getCssValue()
   WebElement button = driver.findElement(By.xpath("(//a[text()=' Coding Ground'])[2]"));
   
   String color = button.getCssValue("background-color");
   System.out.println(color);
   String hexColor = Color.fromString(color).asHex();
   System.out.println("Actual color of 'Coding Groung' is  "+ hexColor);  //Actual color = #0dba4b and Expected color = #0dba4b;
   		      
			   }

	}


