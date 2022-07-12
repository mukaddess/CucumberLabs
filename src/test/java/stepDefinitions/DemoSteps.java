package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.AddTarifPlanSuccessful;
import pages.Home;
import pages.TariffPlan;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;



public class DemoSteps extends BrowserUtils {
    Home home=new Home();
    AddTarifPlanSuccessful addTarifPlanSuccessful=new AddTarifPlanSuccessful();
   TariffPlan submit=new TariffPlan();



    //TariffPlan submit=new TariffPlan();
    //AddTarifPlanSuccessful addTarifPlanSuccessful=new AddTarifPlanSuccessful();
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {

    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        home.setAddTariffPlan();
    }

    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String string) {

        addTarifPlanSuccessful.setVerification1Text(string);

    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> dataTable) {

        submit.setMonthlyRental(dataTable.get("Monthly Rental"));
        submit.setFreeLocalMinutes(dataTable.get("Free Local Minutes"));
        submit.setFreeInternationalMinutes(dataTable.get("Free International Minutes"));
        submit.setFreeSmsPack(dataTable.get("Free SMS Pack"));

        submit.setLocalCharges(dataTable.get("Local Per Minutes Charges"));
        submit.setInternationalCharges((dataTable.get("International Per Minutes Charges")));
       // submit.setFreeInternationalMinutes(dataTable.get("International Per Minutes Charges"));
        submit.setSmsCharges(dataTable.get("SMS Per Charges"));


    }

    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {

        submit.setSubmitButton();


    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        addTarifPlanSuccessful.setVerificationText(string);

    }


}
