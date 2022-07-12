package NewKiteTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseNew.BaseNew;
import KiteUtilityNew.UtilityProp;
import NewBaseKite.Base;
import kitePOMUsingPropertiesNew.kiteHomePage;
import kitePOMUsingPropertiesNew.kiteLoginPage;
import kitePOMUsingPropertiesNew.kitePinPage;

public class ValidateKiteUserIDUingProperty extends Base {
	kiteHomePage home;
	kiteLoginPage login;
	kitePinPage pin;
	String TCID="555";
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
	      openBrowser();
	
	login= new kiteLoginPage(driver);
	pin= new kitePinPage(driver);
	home= new kiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
	login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
	login.clickOnLoginButton();
	pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
	pin.clickOnContinueButton();
	}
	
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
	Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
	UtilityProp.captureScreenshot(driver, TCID);
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
