package StepDefinition;

import Helper.Check;
import Pages.Darksky.LaunchPageDarkSky;
import Web.UseDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DarkSkySD {
    LaunchPageDarkSky lpd = new LaunchPageDarkSky();

    @When("^I launch darkSky website$")
    public void launchdarkSky() {
        UseDriver.openUrl("https://www.darksky.net/");
    }

    @Then("^I check Feels$")
    public void gfgf() {
        lpd.verifyFeelsLike();


    }
}
