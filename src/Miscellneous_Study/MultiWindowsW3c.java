package Miscellneous_Study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowsW3c {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		String mainPageID = driver.getWindowHandle();
        System.out.println(mainPageID);
        System.out.println("===============");
        driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[3]")).click();
        
       Set<String> AllwindowIDs = driver.getWindowHandles();
        ArrayList <String>al = new ArrayList(AllwindowIDs);
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.get(3));
        Thread.sleep(1000);
        driver.switchTo().window(al.get(1));
        driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(al.get(2));
        driver.findElement(By.xpath("//a[@onclick='openMenu()']")).click();
        Thread.sleep(4000);
        driver.close();
        Thread.sleep(500);
        driver.switchTo().window(al.get(3));
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@onclick='spaceIt.showDialog()']")).click();
        Thread.sleep(4000);
        driver.close();
        
}
}
