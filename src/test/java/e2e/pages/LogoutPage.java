package e2e.pages;

import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends CommonMethods {

    public LogoutPage(){
        PageFactory.initElements(CommonMethods.getDriver(),this);
    }

    @FindBy(id = "userData")
    private WebElement userHead;
    @FindBy(css = "[data-bind='click: logout']")
    private WebElement logOut;

   public void setLogout(){
       Actions actions = new Actions(CommonMethods.getDriver());
       actions.moveToElement(userHead).click(logOut).build().perform();

   }
}
