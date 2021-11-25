package pages.loans;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class CarLoansPage extends BasePage {

//    WebDriver driver;
//    public CarLoansPage(WebDriver driver){
//        this.driver = driver;
//    }

    private final By tabAgreements = By.xpath("//div[contains(text(), 'Agreements')]");

    public void selectAgreementsTab(){
        driver.findElement(tabAgreements).click();
    }
}
