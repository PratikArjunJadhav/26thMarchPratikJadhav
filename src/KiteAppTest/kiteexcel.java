package KiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteexcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		File myfile = new File("C:\\Users\\HP\\Desktop\\class data\\Selenium\\Book2.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String UN = mySheet.getRow(1).getCell(0).getStringCellValue();
        String PSD = mySheet.getRow(1).getCell(1).getStringCellValue();
        String PIN = mySheet.getRow(1).getCell(2).getStringCellValue();
		 
			
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
        WebElement userId = driver.findElement(By.id("userid"));
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userId.sendKeys(UN);
		password.sendKeys(PSD);
		
		loginButton.click();
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		pin.sendKeys(PIN);
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continueButton.click();
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		Thread.sleep(2000);
		String actualUserID = userName.getText();
		String expectedUserID=UN;
		if(actualUserID.equals(expectedUserID))
		{
		System.out.println("User ID matching TC is PASSED");
		}
		else {
		System.out.println("User ID not matching TC is FAILED");
		}
		userName.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
