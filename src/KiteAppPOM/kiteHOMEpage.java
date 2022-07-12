package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHOMEpage {
	
	// 1.data members
	@FindBy (xpath = "//span[@class='user-id']")private WebElement UNatHomePage;
	@FindBy (xpath = "//span[@class='user-id']")private WebElement ClickOnUN;
	@FindBy (xpath = "//a[@target='_self']")private WebElement ClickOnLogoutButton;

	//2. constructor
	public kiteHOMEpage(WebDriver driver)
	
	{
			PageFactory.initElements(driver ,this);
		}
	
	//3. methods
	
	public void UNatHomePage() 
	{
		String actualUserID = UNatHomePage.getText();
		String expectedUserID = "ELR321";
		if(actualUserID.equals(expectedUserID) )
		{
			System.out.println("User ID matching TC is PASSED");
		}
		else
		{
			System.out.println("User ID not matching TC is PASSED");
		}
		
	}
	
		
	public void ClickOnUN()
	{
		ClickOnUN.click();
	}
	
	public void ClickOnLogoutButton() 
	{
		ClickOnLogoutButton.click();
	}
	
	
}
