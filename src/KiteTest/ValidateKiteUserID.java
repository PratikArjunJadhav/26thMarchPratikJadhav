package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMnew.kiteHomePage;
import KitePOMnew.kiteLoginPage;
import KitePOMnew.kitePinPage;
import KiteUtility.Utility;

public class ValidateKiteUserID extends Base {
	kiteHomePage home;
	kiteLoginPage login;
	kitePinPage pin;
	
	@BeforeClass
	public void launchBrowser()
	{
	openBrowser();
	login= new kiteLoginPage(driver);
	pin= new kitePinPage(driver);
	home= new kiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(Utility.readDataFromExcel(1, 0));
	login.sendPassword(Utility.readDataFromExcel(1, 1));
	login.clickOnLoginButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.sendPin(Utility.readDataFromExcel(1, 2));
	pin.clickOnContinueButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
	Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(1, 0),"Actual and Expected are not matching TC is failed");
	}
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
	home.logOut();
	}
	@AfterClass
	public void closeBrowser()
	{
	driver.close();
	}
	
	}

