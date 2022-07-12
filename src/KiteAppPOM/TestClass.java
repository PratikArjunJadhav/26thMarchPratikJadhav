package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnloginButton();
		Thread.sleep(2000);
		
		kitePINpage ppk = new kitePINpage(driver);
		ppk.LoginPIN();
		ppk.ClickOnContinueButton();
		Thread.sleep(4000);
		
		kiteHOMEpage hpk = new kiteHOMEpage(driver);
		hpk.UNatHomePage();
		hpk.ClickOnUN();
		hpk.ClickOnLogoutButton();
		
		Thread.sleep(100);
		driver.close();
	}

}
