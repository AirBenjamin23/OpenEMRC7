package e2e.stepDefinitions;

import e2e.pages.LoginPage;
import e2e.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login extends CommonMethods{


    @Given("User navigates to website and verify login page title as {string}")
    public void user_navigates_to_website_and_verify_login_page_title_as(String loginPageTitle) {
        Assert.assertEquals(loginPage.loginPageTitle(),loginPageTitle);

    }
    @When("User enters valid username")
    public void user_enters_valid_username() {
         loginPage.setUserName();
    }
    @Then("User enters valid password")
    public void user_enters_valid_password() {
              loginPage.setPassword();
    }
    @Then("User selects language as {string}")
    public void user_selects_language_as(String language) {
       loginPage.selectLanguage(language);
    }
    @Then("User clicks login button")
    public void user_clicks_login_button() {
     loginPage.setLoginButton();
    }
    @Then("User verifies Home Page title as {string}")
    public void user_verifies_home_page_title_as(String homePageTitle) {
        Assert.assertEquals(homePage.getHomePageTitle(),homePageTitle);
    }
    @When("User enters invalid username")
    public void user_enters_invalid_username() {
        loginPage.setInvalidUserName();
    }
    @Then("User gets user friendly error message as {string}")
    public void user_gets_user_friendly_error_message_as(String errorMessage) {
       Assert.assertEquals(loginPage.setErrorMessage(),errorMessage);
    }

    @Then("User enters invalid password")
    public void userEntersInvalidPassword() throws InterruptedException {
         loginPage.setInvalidPassword();

    }
}
