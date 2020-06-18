package tests;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import support.Web;

import static org.junit.Assert.assertEquals;
public class loginSteps {

	private WebDriver driver;

	@Given("^I am in the login page$")
	public void i_am_in_the_login_page()  {
		driver = Web.createChrome();
	}

	@When("^I put admin valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_put_admin_valid_credentials_and(String user,String password) {

		new LoginPage(driver)
				.typeLogin(user)
				.typePassword(password);
	}

	@Then("^The application go to home page$")
	public void the_application_go_to_home_page() {
		String adminText = new LoginPage(driver)
				.clickLogin()
				.captureAdminText();
		assertEquals("admin",adminText);
	}

	@When("^I put invalid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_put_invalid_credentials_and(String user,String password)  {
		new LoginPage(driver)
				.typeLogin(user)
				.typePassword(password);
	}

	@Then("^I could not login$")
	public void i_could_not_login()  {
		String message = new LoginPage(driver)
				.clickLogin()
				.usernameOrPasswordIncorrect();
		assertEquals("Your account may be disabled or blocked or the username/password you entered is incorrect.",message);
	}
	@After
	public void tearDown(){
		driver.quit();
	}

}
