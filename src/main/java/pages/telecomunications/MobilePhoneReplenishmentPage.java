package pages.telecomunications;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {


//    public MobilePhoneReplenishmentPage(WebDriver driver)
//    {
//        super(driver);
//    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");

    public void selectCardFromWallet(){
        driver.findElement(buttonWallet).click();
    }
}
