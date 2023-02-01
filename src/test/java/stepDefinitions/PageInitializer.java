package stepDefinitions;

import pages.LoginPage;

public class PageInitializer {

    public static LoginPage loginPAge;


    public static void initializePageObjects(){
        loginPAge = new LoginPage();

    }
}
