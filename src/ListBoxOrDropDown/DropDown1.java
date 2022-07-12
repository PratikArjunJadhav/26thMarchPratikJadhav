package ListBoxOrDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw4ayUBhA4EiwATWyBroLpDH_LigEhyCAXwRPuz6MmruiYJAabj89oU0yoeKSqFk3hJfqIqxoCZJ8QAvD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1. day
		WebElement Date = driver.findElement(By.id("day"));
		
		Select s1= new Select(Date);
		s1.selectByIndex(21);
		 
		//2. Month
		
		 WebElement month = driver.findElement(By.id("month"));
		 Select s2 = new Select(month);
		 s2.selectByValue("6");
		 
		 //3.Year
		 
		WebElement year = driver.findElement(By.id("year"));
		 Select s3 = new Select(year);
		 s3.selectByValue("1998");
		 
		
		
		
				
				
				
	}

}
