package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.PageInitializer;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static utils.Constants.Explicit_Wait;
import static utils.Constants.Implicit_Wait;

public class CommonMethods extends PageInitializer {

      private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();


     /*private CommonMethods(){

     }*/

     public static WebDriver getDriver(){
            if (driverPool.get() == null ){
                  synchronized (CommonMethods.class){
                        switch (ConfigReader.getProperties("browser")){
                              case "chrome":
                                    WebDriverManager.chromedriver().setup();
                                    driverPool.set(new ChromeDriver());
                                    break;
                              case "firefox":
                                    WebDriverManager.firefoxdriver().setup();
                                    driverPool.set(new FirefoxDriver());
                                    break;
                              default:
                                    System.out.println("No Browser to initiate");
                        }
                  }
            }
            return driverPool.get();
     }

     public static void initializeWebApp(){
            CommonMethods.getDriver();
            CommonMethods.getDriver().manage().window().maximize();
            CommonMethods.getDriver().get(ConfigReader.getProperties("url"));
            CommonMethods.getDriver().manage().timeouts().implicitlyWait(Implicit_Wait, TimeUnit.SECONDS);
            initializePageObjects();
     }
     public static void closeBrowser(){
            if (driverPool != null){
                  driverPool.get().close();
                  driverPool.remove();
            }
     }
     public static WebDriverWait getWait(){
           WebDriverWait wait = new WebDriverWait(CommonMethods.getDriver(),Explicit_Wait);
           return wait;
     }
     public static void waitForClickable(WebElement element){
            getWait().until(ExpectedConditions.elementToBeClickable(element));
     }
     public static void click(WebElement element){
            waitForClickable(element);
            element.click();
     }

}
