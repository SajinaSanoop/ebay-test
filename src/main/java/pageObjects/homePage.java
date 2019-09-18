package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	public WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.id("gh-ac");
	By searchButton=By.id("gh-btn");
	
	public WebElement get_Searchbar()
	{
		return driver.findElement(search);
	}
	public WebElement get_SearchButton()
	{
		return driver.findElement(searchButton);
	}
}
