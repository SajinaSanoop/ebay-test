package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signin_Page {
	
	public WebDriver driver;
	public signin_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.id("userid");
	By password=By.id("pass");
	By sigin_Button=By.id("sgnBt");
	By errorMessage=By.id("errf");
	By continueButton=By.id("signin-continue-btn");
	public WebElement get_UserName()
	{
		return driver.findElement(username);
	}
	public WebElement get_Continue_Button()
	{
		return driver.findElement(continueButton);
	}
	public WebElement get_Password()
	{
		return driver.findElement(password);
	}
	public WebElement get_Button()
	{
		return driver.findElement(sigin_Button);
	}
	public WebElement get_ErrorMessage()
	{
		return driver.findElement(errorMessage);
	}
}
