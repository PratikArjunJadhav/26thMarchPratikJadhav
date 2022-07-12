package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePINpage {

	// 1.data members
	@FindBy (id = "pin") private WebElement LoginPIN;
	@FindBy (xpath = "//button[@type='submit']") private WebElement ClickOnContinueButton;
	
	//2. constructor
	public kitePINpage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	
	//3.Methods
	public void LoginPIN()
	{
		LoginPIN.sendKeys("982278");
	}
	
	public void ClickOnContinueButton()
	{
		ClickOnContinueButton.click();
	}
}
