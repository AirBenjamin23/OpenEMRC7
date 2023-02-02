package e2e.stepDefinitions;

import e2e.pages.HomePage;
import e2e.pages.LoginPage;
import e2e.pages.LogoutPage;

public class PageInitializer {

    public static LoginPage loginPage;
    public static HomePage homePage;
    public static LogoutPage logoutPage;

    public static void initializePageObjects(){
        loginPage = new LoginPage();
        homePage = new HomePage();
        logoutPage = new LogoutPage();
    }
}
