package e2e.pages;

import com.github.javafaker.Faker;
import e2e.utils.CommonMethods;
import e2e.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class LoginPage extends CommonMethods{

    public LoginPage(){
        PageFactory.initElements(CommonMethods.getDriver(),this);
    }

    Faker faker;


    @FindBy(id = "authUser")
    private WebElement userName;
    @FindBy(id = "clearPass")
    private WebElement password;
    @FindBy(css = "[name='languageChoice']:nth-child(1)")
    private WebElement language;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Invalid username or password')]")
    private WebElement errorMessage;


    public String loginPageTitle(){
        return CommonMethods.getDriver().getTitle();
    }
    public void setUserName(){
        userName.sendKeys(ConfigReader.getProperties("userName"));
    }
    public void setPassword(){
        password.sendKeys(ConfigReader.getProperties("password"));
    }
    public void selectLanguage(String languageText){
        Select select = new Select(language);
        select.selectByVisibleText(languageText);
    }
    public void setLoginButton(){
        click(loginButton);
    }
    public void setInvalidUserName(){
        userName.sendKeys("");
    }
    public void setInvalidPassword() throws InterruptedException {
         password.sendKeys("");

    }

    public String setErrorMessage(){
        return errorMessage.getText();
    }

}
