package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver driver;
	public Properties p;
	public WebDriver initializeDriver() throws IOException
	{
		p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Sanoop\\Eclipse_Workspace_Sajina\\Ebay_test\\src\\main\\java\\resources\\data.properties");
		p.load(fis);
		if(p.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
}
