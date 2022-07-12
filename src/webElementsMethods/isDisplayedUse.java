package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textBox = driver.findElement(By.name("show-hide"));
		show.click();
		
		if (textBox.isDisplayed())
		{
			System.out.println("Thank you text box is displayed");
		}
		else {
			System.out.println("can not find the text box");
		}
		
		hide.click();
		
		if(textBox.isSelected())
		{
			System.out.println("Thank you text box is displayed");
		}
		else {
			System.out.println("can not find the text box");
		}

	}

}
