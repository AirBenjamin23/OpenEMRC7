package e2e.stepDefinitions;

import e2e.utils.CommonMethods;
import io.cucumber.java.en.Given;

public class Logout extends CommonMethods {

    @Given("User logouts when navigates to Home Page")
    public void user_logouts_when_navigates_to_homeage() throws InterruptedException {
       logoutPage.setLogout();
       Thread.sleep(5000);
    }
}
