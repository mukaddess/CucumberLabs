package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class AddTarifPlanSuccessful extends BrowserUtils {
    public AddTarifPlanSuccessful(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//h1[.='Add Tariff Plans']")
    private WebElement verification1Text;

    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']")
    private WebElement verificationText;

    public void setVerification1Text(String expected1Mesaage){
        Assert.assertEquals(verification1Text.getText(),expected1Mesaage);
    }

    public void setVerificationText(String expectedMessage){
        Assert.assertEquals(verificationText.getText(),expectedMessage);
    }
}
