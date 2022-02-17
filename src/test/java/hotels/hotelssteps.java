package hotels;

import February.HotelsFebruary1;
import Helper.Check;
import HomeWork4.task1.SignUpPage;
import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import org.openqa.selenium.By;
import org.testng.Assert;

public class hotelssteps {

    LaunchPage launchPage11 = new LaunchPage();
    HotelsFebruary1 HF = new HotelsFebruary1();
    SignUpPage sPage11 = new SignUpPage();

    @When("^I launch hotels website$")
    public void launchhotels() {
        UseDriver.openUrl("https://www.hotels.com/");

    }

    @When("^I click on check in calendar$")
    public void clickOnCheckIN() {
        HF.clickCheckInHotel();

    }

    @And("^I click on button \"back\"")
    public void clickBackMontButton() {
        HF.clickBackButton();
    }

    @And("^I check are dates disabled$")
    public void checkEnabledDates() {
        HF.getElementsDates();
    }

    @Then("^I verify back button on current month is disabled$")
    public void BackButtonDisabled() {
        Check.checkTrue(HF.BackButtonDisabled(), "back button enabled");

        /////////////////////////////////////////////////////////////////////////
    }

    @When("^I click on guest button$")
    public void clickOnGuestButton() {
        HF.clickGuestButton();
    }

    /////////////////////////////////////////////////////////////////////


    @When("^I click Search tab$")
    public void clickSearchTab() {
        HF.clickSearchTab();
    }

    @And("^I enter “bora” in destination$")
    public void enterDestunation() {
        HF.enterSearchText("bora");
    }

    @And("I Select “Bora Bora, Leeward Islands, French Polynesia” from auto suggestion$")
    public void SelectFromSuggestion() {
        HF.selectFromSearchSuggestions("Pearl Resort Beach");
    }

    @When("^I click check in button$")
    public void clickCheckIn() {
        HF.clickChechInButton();
    }

    @And("^I click next button$")
    public void clickNezt() {
        HF.clickNextBut();
    }

    @And("^I Select April 1, 2022 as Check-in$")
    public void clickAprilOne() {
        HF.clickAprilOne();
    }

    @And("^I select April 10 2022 as Check-out date$")
    public void clickAprilTen() {
        HF.clickApril10();
    }

    @And("^I click apply button locator$")
    public void clickApplyButton() {
        HF.clickApplyButton();
    }

    @When("^I click Search button$")
    public void clickSearchButton() {
        HF.clickSearchButtonHotel();
    }

    @Then("^I verify \"Change dates\" button is enabled$")
    public void isChangeDatesButtonEnabled() {
        Assert.assertTrue(HF.changeButtonEnabled(), "Change Dates button is disabled");
    }


/////////////////////////////////////////////////////////////////////

    @When("I click sign in button$")
    public void clickSignInButton() {
        HF.signInClick();
    }

    @And("^I enter email$")
    public void enterInvalidEmail() {
        HF.enterLoginEmail("%$#^");

    }

    @And("^I enter password$")
    public void enterInvalidPassword() {
        HF.enterLoginPassword("$#2^^");
    }

    @And("^I click on sign in button$")
    public void clickOnSignInButton() {
        HF.clickOnSignInButton();

    }

    @Then("^I verify Verification message is displayed$")
    public void verificationmessageDisplayed() {
        Assert.assertTrue(HF.verificationMessageDisplayed(), "Verification message is not displayed");
    }

    @And("^I click on SignUp link$")
    public void clickOnSignUpButton() {
        HF.clickOnSignUp();
    }

    @When("^I click on email box$")
    public void clickOnEmailBox() {
        HF.clickOnEmailBox();
    }

    @And("^I enter this email$")
    public void enterEmail() {
        HF.enterLoginForSignUpEmail("#!@###");
        HF.clickOnPasswordBox();
    }

    @When("^I verify error message is displayed$")
    public void isErrorEmailDisplayed() {
        Assert.assertTrue(HF.errorMessageIsDisplayed(), "Please check your email address-is not displayed");
    }

    @When("^I enter this password$")
    public void enterPasswordForSignUp() {
        HF.enterSignUpPassword("aaa");
        HF.clickOnEmailBox();

    }

    @And("^I verify password error is displayed$")
    public void passwordErrordisplayedForSignUp() {
        Assert.assertTrue(HF.passwordErrorDisplayed(), "Please enter a password containing at least six characters-is not displayed");
    }

    @When("^I enter password greater than 20$")
    public void enterGreaterPassword() {
        HF.clickOnPasswordBox();
        HF.enterSignUpPassword("gdferstfdgrhtdrfscdfrfd");
        HF.clickOnEmailBox();
    }

    @And("^I verify error message is displayed for password greater than 20$")
    public void errorMessageforPasswordGreaterthan20() {
        Assert.assertTrue(HF.passwordEroordisplayed20(), "Your password cannot be more than 20 characters long.-is not displayed");


    }

    @When("^I enter invalid first name$")
    public void invalidFirstName() {
        HF.clickOnFirstNameBox();
        HF.enterInvalidName("5");
        HF.clickOnSecondNameBox();
    }

    @And("^I verify first name error is displayed$")
    public void firstNameErrorDisplayed() {
        Assert.assertTrue(HF.firstNameErrorDisplayed(), "Please check your first name-is not displayed");
    }

    @When("^I enter invalid second name$")
    public void enterinvalidSecondName() {
        HF.enterInvalidSecondName("6");
        HF.clickOnFirstNameBox();
    }

    @Then("^I verify second name error is displayed$")
    public void secondNameErrorDisplayed() {
        Assert.assertTrue(HF.secondNameErrordisplayed(), "Please check your last name-is not displayed");
    }

    @And("^I enter my email$")
    public void enterMyEmail() {
        HF.enterLoginForSignUpEmail("grad123@gmail.com");
        HF.clickOnPasswordBox();


    }

    @And("^I verify tick-mark is displayed$")
    public void tickMarkIsDisplayed() {
        HF.tickMarkisDisplayed();
    }

    @When("^I enter my password$")
    public void enterMyPasswordForSignUp() {
        HF.enterSignUpPassword("123GTRF54");
        HF.clickOnEmailBox();


    }

    @And("^I verify password tick-mark is displayed$")
    public void passwordTickMarkIsDisplayed() {
        HF.passwordTickMarkisDisplayed();
    }

    @When("^I enter valid first name$")
    public void validFirstName() {
        HF.clickOnFirstNameBox();
        HF.enterValidName("Google");
        HF.clickOnSecondNameBox();
    }

    @And("^I verify first name tick-mark is displayed$")
    public void firstNTickMarkIsDisplayed() {
        HF.firstNameTickMarkisDisplayed();


    }

    @When("^I enter valid second name$")
    public void enterValidSecondName() {
        HF.enterValidSecondName("Maps");
        HF.clickOnFirstNameBox();

    }

    @Then("^I verify second name tick-mark is displayed$")
    public void secondNameTickMarkDisaplayed() {
        HF.secondNameTickMarkisDisplayed();
    }

    @And("^I click help button$")
    public void clickOnHelpButton() {
        HF.clickHelpButton();
    }

    @And("^I click Feedback button$")
    public void clickOnfeedback() {
        HF.clickwebSite();
    }

    @And("^I click on submit button$")
    public void clickOnSubmitButton() {
        HF.submitButton();
    }

    @When("^I verify \"Please fill in the required information highlighted below\" is displayed$")
    public void messageFillInformationIsDiisplayed() {
        HF.messageEnterInformationIsdisplayed();
    }

    @Then("^I verify star boxes section is in a red dotted box$")
    public void starBoxesDisplayed() {
        HF.redDotsBoxDisplayed();
    }

    @When("^I click star$")
    public void clickStar() {
        HF.clickReatingThree();
    }

    @And("^I enter comment$")
    public void enterComment() {
        HF.enterInformation();
    }

    @And("^I Select option for How likely are you to return$")
    public void selectUnsure() {
        HF.selectOptions();
    }

    @And("^I Select answer for Prior to this visit, have you ever booked$")
    public void bookedBeforeYes() {
        HF.bookedOnHotelsYes();
    }

    @And("^I answer for 'Did you accomplish what you wanted to do on this page'$")
    public void accomplishOrNot() {
        HF.accomplishYes();
    }

    @Then("^I Verify “THANK YOU FOR YOUR FEEDBACK.“ is displayed$")
    public void ThankYouForFeedbackDisplayed() {
        Assert.assertTrue(HF.verifyThankYouForfeedbackDisp(), "Thank you for your feedback is not displayed");
    }

///////////////////////////////////////////


    @And("^I verify Free cancellation is displayed$")
    public void freeCancellationDisplayed() {
        Assert.assertTrue(HF.freeCnacellationDisplayed(), "Free cancellation\n" +
                "on most hotels* is not displayed");


    }

    @And("^I verify Our price guarantee link is displayed$")
    public void priceGuaranteeDisplayed() {
        Assert.assertTrue(HF.priceGuaranteeDisplayed(), "Our price guarantee\n" +
                "find out more is not displayed");
    }

    @And("^I verify Get a reward night is displayed$")
    public void getRewardNightDisplayedDisplayed() {
        Assert.assertTrue(HF.getRewardNightDisplayed(), "Get a reward night\n" +
                "For every 10 nights you stay is not displayed");
    }

    @When("^I click on Our price guarantee link$")
    public void clickGuarantee() {
        HF.clickGuaranteeLink();
    }

    @And("^I going back to 'Why book' section$")
    public void clickGoingBack() {
        HF.clickGoingBack();
    }

    @Then("^I Click on  Get a reward night link$")
    public void clickGetRewardNight() {
        HF.clickGetRewardNight();

    }

    @And("^I verify 'Instant savings.Reward..' displayed$")
    public void instantSavingsDisplayed() {
        Assert.assertTrue(HF.InstantSavingsDisplayed(), "Instant savings. Reward* nights. And more ... is not displayed");

    }
}