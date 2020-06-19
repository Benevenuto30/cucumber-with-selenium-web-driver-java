package tests;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CreateProject;
import pages.LoginPage;
import pages.MyAccount;
import support.Web;

public class ChangePasswordSteps {

	private WebDriver driver;

	@Given("^I am logged in application$")
	public void i_am_logged_in_application() {
		driver = Web.createChrome();
		new LoginPage(driver)
				.typeLogin("admin")
				.typePassword("root")
				.clickLogin();
	}

	@When("^I click on my profile$")
	public void i_click_on_my_profile()  {
			new CreateProject(driver)
					.clickOnMe();
	}

	@When("^I put my new password$")
	public void i_put_my_new_password()  {
			new MyAccount(driver)
					.typeCurrentPassword()
					.typeNewPassword()
					.typeConfirmPassword();
	}

	@Then("^I see a message that my password was changed$")
	public void i_see_a_message_that_my_password_was_changed()  {
		new MyAccount(driver)
				.clickUpdateUser();
	}
	@After
	public void tearDown (){
		driver.quit();
	}
}
