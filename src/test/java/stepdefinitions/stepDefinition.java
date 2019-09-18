package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.homePage;
import pageObjects.signin_Page;
import resources.base;

public class stepDefinition extends base {

	@Given("^launch the chrome browser$")
	public void launch_the_chrome_browser() throws IOException {
		driver = initializeDriver();
	}

	@And("^navigate to the url \"([^\"]*)\"$")
	public void navigate_to_the_url_something(String strArg1) {

		driver.get(strArg1);
	}

	@When("^enter the credentials to sign in to ebay account username  (.+) and password (.+)$")
	public void enter_the_credentials_to_sign_in_to_ebay_account_username_and_password(String username,
			String password) {
		signin_Page sp = new signin_Page(driver);
		sp.get_UserName().sendKeys(username);
		sp.get_Password().sendKeys(password);

	}

	@And("^click on the Sign in button$")
	public void click_on_the_sign_in_button() {
		signin_Page sp = new signin_Page(driver);
		sp.get_Button().click();
	}

	@Then("^verify that the user is redirected to the Home page by searching \"([^\"]*)\" in the search bar$")
	public void verify_that_the_user_is_redirected_to_the_home_page_by_searching_something_in_the_search_bar(
			String searchtext) {
		homePage hp = new homePage(driver);
		signin_Page sp = new signin_Page(driver);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Sign in or Register"))
		{
			System.out.println(sp.get_ErrorMessage().getText());
		}
		else
		{
			//Assert.assertTrue(hp.get_Searchbar().isDisplayed());
			hp.get_Searchbar().sendKeys(searchtext);
			hp.get_SearchButton().click();
		}
	
	}
	

	@And("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}

}
