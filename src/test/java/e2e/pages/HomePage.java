package e2e.pages;

import e2e.utils.CommonMethods;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonMethods {


    public HomePage(){
        PageFactory.initElements(CommonMethods.getDriver(),this);
    }




    public String getHomePageTitle(){
        return CommonMethods.getDriver().getTitle();
    }





}
