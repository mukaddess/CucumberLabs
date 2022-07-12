package pages;

import net.bytebuddy.implementation.MethodCall;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class TariffPlan extends BrowserUtils {
    public TariffPlan(){PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(id = "rental1")
    private WebElement monthlyRental;

    @FindBy(id = "local_minutes")
    private WebElement freeLocalMinutes;

    @FindBy(id = "inter_minutes")
    private WebElement freeInternationalMinutes;

    @FindBy(id = "sms_pack")
    private WebElement freeSmsPack;

    @FindBy(id = "minutes_charges")
    private WebElement localCharges;

    @FindBy(id = "inter_charges")
    private WebElement internationalCharges;

    @FindBy(id = "sms_charges")
    private WebElement smsCharges;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;


    public void setMonthlyRental(String MonthlyRental) {
        staticWait(1);
        monthlyRental.sendKeys(MonthlyRental);
    }

    public void setFreeLocalMinutes(String FreeLocalMinutes) {
        staticWait(1);
        freeLocalMinutes.sendKeys(FreeLocalMinutes);
    }

    public void setFreeInternationalMinutes(String FreeInternationalMinutes) {
        staticWait(1);
        freeInternationalMinutes.sendKeys(FreeInternationalMinutes);
    }

    public void setFreeSmsPack(String FreeSmsPack) {
        staticWait(1);
        freeSmsPack.sendKeys(FreeSmsPack);
    }

    public void setLocalCharges(String LocalCharges) {
        staticWait(1);
        localCharges.sendKeys(LocalCharges);
    }

    public void setInternationalCharges(String InternationalCharges) {
        staticWait(1);
        internationalCharges.sendKeys(InternationalCharges);
    }

    public void setSmsCharges(String SmsCharges) {
        staticWait(1);
        smsCharges.sendKeys(SmsCharges);
    }

    public void setSubmitButton() {
        staticWait(2);
        submitButton.click();
    }
}
