package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.loans.CarLoansPage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

import java.util.concurrent.TimeUnit;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static pages.base.BasePage.driver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected BasePage basePage;
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage;
    protected CarLoansPage carLoansPage;
    protected CommonActions commonActions;

    @BeforeEach
    public void start() {
        BasePage.initDriver();
        mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage();
        basePage = new BasePage();
    }

    @AfterEach
    void clearCookiesAndLocalStorage(){
        if(CLEAR_COOKIES){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");

        }
    }

    @AfterAll
    void close(){
        if(HOLD_BROWSER_OPEN){
            driver.close();
        }

    }
}
