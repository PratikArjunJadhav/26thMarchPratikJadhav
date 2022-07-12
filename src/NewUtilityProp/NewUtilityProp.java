package NewUtilityProp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class NewUtilityProp {
	
	public static void captureScreenShot(WebDriver driver, String TCID) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest = new File("C:\\Users\\HP\\Desktop\\class data\\Selenium\\screenshot\\"+TCID+".png");
		  FileHandler.copy(src, dest);
	}
	
	public static String getDataFromPropFile(String key) throws IOException 
	{
		Properties prop= new Properties();// created object of properties
		FileInputStream myfile= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\seleniumStudy\\myProperties.properties");
		prop.load(myfile); 
		String value = prop.getProperty(key);
		return value;
	}
}
