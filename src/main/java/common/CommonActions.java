package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class CommonActions {
    public static WebDriver createDriver(){
        switch (BROWSER_AND_PLATFORM) {
            case "CHROME_MAC" :
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
                return new ChromeDriver();

            case "CHROME_WINDOWS" :
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
                return new ChromeDriver();

            case "MOZILLA_WINDOWS" :
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                return new FirefoxDriver();

            default:
                return new ChromeDriver();
        }
    }
}
