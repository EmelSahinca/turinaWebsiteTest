package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class US01_stepdefinition {


    @Given("user goes home page")
    public void user_goes_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("urlturina"));
    }

}
