package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CarLoansPage extends BasePage {

    WebDriver driver;
    public CarLoansPage(WebDriver driver){
        this.driver = driver;
    }

    public final By tabAgreements = By.xpath("//div[contains(text(), 'Agreements')]");

    public void selectAgreementsTab(){
        driver.findElement(tabAgreements).click();
    }
}
