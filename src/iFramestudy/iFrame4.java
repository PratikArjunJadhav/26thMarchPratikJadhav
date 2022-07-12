package iFramestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrame4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		 Thread.sleep(1000);
		 
           driver.findElement(By.id("name")).sendKeys("Good Morning");
           // switch from main page to frame1
           driver.switchTo().frame("frm1");
           WebElement dropdown = driver.findElement(By.id("course"));
        	Select course = new Select(dropdown);
        	course.selectByValue("java");
          	Thread.sleep(500);
        	// switch from frame1 to main page
          driver.switchTo().defaultContent();
          driver.findElement(By.id("name")).sendKeys("This is Main page from frame1");
           // switch from main page to frame1
          driver.switchTo().frame("frm1");
          WebElement mulselected = driver.findElement(By.id("ide"));
          Select ide = new Select(mulselected);
          ide.isMultiple();
          ide.selectByIndex(0);
          ide.selectByIndex(3);
          Thread.sleep(500);
          
          //switch frame1 to frame2 that we need to first switch to main page and then switch to frame2
          driver.switchTo().defaultContent();
          Thread.sleep(500);
          driver.switchTo().frame("frm2");
          driver.findElement(By.id("firstname")).sendKeys("Pratik");
          Thread.sleep(500);
          driver.findElement(By.id("lastName")).sendKeys("Jdhav");
          driver.findElement(By.id("englishchbx")).click();
          
          //switch frame2 to Nasted frame3 that we need to first focus on main page and then switch to Nasted frame3
          driver.switchTo().defaultContent();
          Thread.sleep(500);
          driver.switchTo().frame("frm3");
          driver.findElement(By.id("name")).sendKeys("Good Bye");
          Thread.sleep(500);
          
          // switch from Nasted frame3 to its child frame1
          driver.switchTo().frame("frm1");
          Select course1= new Select(driver.findElement(By.id("course")));
          course1.selectByValue("python");
          Thread.sleep(500);
          
          // switch to child frame2 from child frame1 then we need switch focus to its parent frame3 then switch to its child frame2
          driver.switchTo().parentFrame();
          Thread.sleep(500);
          driver.switchTo().frame("frm2");
          driver.findElement(By.id("firstname")).sendKeys("Shivansh");
          Thread.sleep(500);
          driver.findElement(By.id("laststname")).sendKeys("Yadav");
          Thread.sleep(500);
          
          // switch to child frame3 to main page
          driver.switchTo().defaultContent();
          WebElement text1 = driver.findElement(By.xpath("(//h1[@itemprop='name'])[1]"));
          System.out.println(text1.getText());
           
       
                   		 
	}

}
