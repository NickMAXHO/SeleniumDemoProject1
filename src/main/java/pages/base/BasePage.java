package pages.base;

import common.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class BasePage {
    public static WebDriver driver;
    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     *
     * The method for navigating to a specific URL
     * */

    public void goToUrl(String url){
       driver.get(url);
    }

    /**
     * Wait for visibility of element
     * */
    public WebElement waitElementIsVisible (WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    /***
     * Check if auth widget is presented
     */
   public void isAuthWidgetPresent(){
        WebElement authFrame = driver.findElement(authWidget);
        waitElementIsVisible(authFrame);
    }
    public static void initDriver(){
        driver = CommonActions.createDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
    }
}
