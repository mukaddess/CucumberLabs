package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class Home extends BrowserUtils {
    public Home(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath= "//a[.='Add Tariff Plan']")
   private WebElement addTariffPlan;


    public void setAddTariffPlan() {
      staticWait(2);
       addTariffPlan.click();



        }

}















