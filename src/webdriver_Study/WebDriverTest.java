package webdriver_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		//driver.close();
		//driver.quit();
		//driver.manage().window().minimize();
		//driver.manage().window().maximize();
		//driver.navigate().to("https://www.google.com/search?q=google+translate&rlz=1C1CHBD_enIN763IN763&oq=gog&aqs=chrome.3.69i57j46i199i465i512j46i10i131i199i433i465j0i10i131i433j0i10i433j0i10i131i433j0i10i433l2j0i10j0i271.10990j0j4&sourceid=chrome&ie=UTF-8");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
	    System.out.println(driver.getTitle());
	    
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
