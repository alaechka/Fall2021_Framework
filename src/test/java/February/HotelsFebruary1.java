package February;

import Helper.Check;
import Helper.Misc;
import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;

import java.util.Set;


public class HotelsFebruary1 extends WebCommands {

    //

    By clickCheckIn = By.className("_2qpRyR");
    By BackMonthButton = By.className("_3iMwcD");
    By DisabledDate = By.className("_yZAx1 _3iv_bt");
    By BackButton = By.className("_3iMwcD");
    By GuestButton = By.className("_1kUm1r");
    By searchTabLocator = By.name("q-destination");
    By searchBoxLocator = By.name("q-destination");
    By allSuggestionsLocator = By.xpath("//ul[contains(@data-stid, 'destination-results')]//strong");

    By checkInButton = By.className("_1yFrqc _1ZtnNu");
    By aprilOneLocator = By.className("_yZAx1 _13Yx7d CHorXi");
    By findApril = By.className("_3LBdi8");
    By aprilLocator = By.xpath("//button[contains(@name,'Apr 01 2022 ')]");
    By nextButton = By.className("NpA0L9");
    By aprilCheckOutLocator = By.name("Sun Apr 10 2022 12:00:00 GMT-0400 (Eastern Daylight Time)");
    By applyButtonLocator = By.className("_3pFoIe");
    By searchButtonLocator = By.xpath("//button[@aria-label='Search']");
    By changeDateButtonLocator = By.xpath("//button[@aria-label='Change dates']");
    // By locAp= By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/button[1]");

    //By DropDownAdults=By.
///////////////

    By loginLocator = By.id("sign-in-email");
    By signInLocator = By.xpath("//span[contains(text(),'Sign in')]");
    By passwordLocator = By.id("sign-in-password");
    By signInButtonLocator = By.id("sign-in-button");

    By verificationMessageLocator = By.xpath("//body/div[@id='main-content']/div[1]/div[1]/div[1]");//body/div[@id='main-content']/div[1]/div[1]/div[1]

    ///////////////////////////////////////////////
    By SignUplinkLocator = By.className("create-acct-switch");
    By SignUpEmailBoxLocator = By.id("sign-up-email");
    By signUpPasswprdLocator = By.id("sign-up-password");
    By emailErrorLocator = By.id("email-error");
    By passwordErrorLocator = By.id("password-error");
    By passwordErrorGreater20Locator = By.xpath("//small[@id='password-error']");
    By firstNameLocator = By.id("sign-up-first-name");
    By secondNameLocator = By.id("sign-up-last-name");
    By firstNameErrorLocator = By.xpath("//small[@id='firstName-error']");
    By secondNameErrorLocator = By.xpath("//small[@id='lastName-error']");
    By tickMarkLocator = By.xpath("//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]");
    By passwordTickMarkLocator = By.xpath("//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]");
    By firstNameTickMark = By.xpath("//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]");
    By secondNameTickMark = By.xpath("//body/div[@id='main-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]");
    By helpButton = By.xpath("//span[contains(text(),'Help')]");
    By FeedbackButtonLocator = By.xpath("//header/div[1]/nav[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    By submitButtonLocator = By.className("submit");
    By redDotsLocator = By.xpath("//fieldset[@id='required_box_page_rating']");
    By messageEnterInformationLocator = By.xpath("//p[contains(text(),'Please fill in the required information highlighte')]");
    By reatingThreeLocator = By.xpath("//span[contains(text(),'3')]");
    By textArea = By.tagName("textarea");
    By selectReturnOptionsLocator = By.tagName("select");
    By unsureOptionLocator = By.xpath("//option[contains(text(),'Unsure')]");
    By boockedHotelBeforeNo = By.xpath("//span[contains(@data-localization, 'booked-before-no')]");
    By accomplishYesLocator = By.xpath("//span[contains(@data-localization, 'were-you-successful-yes')]");
    By thankYouForFeedBackLocator = By.className("question-header");

    //("//body/div[@id='container']//input[@id='booked-here-before-yes']");
    //span[contains(data-localization(), 'booked-before-no')]


    By freecancellationLocator = By.xpath("//li[contains(@class, '_2lKfOI _2Y71AG _3LHmkp')]");
    By ourPriceGuaranteeLocator = By.xpath("//li[contains(@class, 'bPi4hj _2Y71AG _1geHg4')]");
    By getRewardNightLocator = By.xpath("//li[contains(@class, '_3QWktI _2Y71AG _3SZFs0')]");
    By goingBackLocator = By.xpath("//div[contains(@class, 'logo-cont')]//img[contains(@class, 'logo')]");
    By instantsavingsLocator = By.xpath("//h1[contains(text(),'Instant savings. Reward* nights. And more ...')]");


    public void clickCheckInHotel() {
        clickThis(clickCheckIn);
    }

    public void clickBackButton() {
        clickThis(BackMonthButton);
    }

    public void getElementsDates() {
        getEnabledElements(DisabledDate, "dates are enabled");

    }

    public boolean BackButtonDisabled() {
        return isElementSEnabled(BackButton);
    }

    public void clickGuestButton() {
        clickThis(GuestButton);
    }

    public void clickSearchTab() {
        clickThis(searchTabLocator);
    }

    public void enterSearchText(String searchText) {
        type(searchBoxLocator, searchText);
    }

    public void selectFromSearchSuggestions(String destinationName) {
        clickOneOfElementsUsingText(allSuggestionsLocator, destinationName);
    }

    public void clickChechInButton() {
        clickThis(clickCheckIn);
    }

    public void clickNextBut() {
        clickThis(nextButton);
    }

    public void clickAprilOne() {
        clickThis(aprilLocator);

    }

    public void clickApril10() {
        clickThis(aprilCheckOutLocator);
    }

    public void clickApplyButton() {
        clickThis(applyButtonLocator);
    }

    public void clickSearchButtonHotel() {
        clickThis(searchButtonLocator);
        for (int i = 1; i < 9; i++) {
            scrollDown(1000);
            Misc.sleep(2);

        }


    }


    public boolean changeButtonEnabled() {
        return isWebElementDisplayed(changeDateButtonLocator);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    public void signInClick() {
        clickThis(signInLocator);
    }

    public void enterLoginEmail(String loginEmail) {
        type(loginLocator, loginEmail);
    }

    public void enterLoginPassword(String loginPwd) {
        type(passwordLocator, loginPwd);
    }

    public void clickOnSignInButton() {
        clickThis(signInButtonLocator);
    }

    public boolean verificationMessageDisplayed() {
        return isWebElementDisplayed(verificationMessageLocator);
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    public void clickOnSignUp() {
        clickThis(SignUplinkLocator);
    }

    public void enterLoginForSignUpEmail(String loginEmail) {
        type(SignUpEmailBoxLocator, loginEmail);
    }

    public void enterSignUpPassword(String loginPwd) {
        type(signUpPasswprdLocator, loginPwd);
    }

    public boolean errorMessageIsDisplayed() {
        return isWebElementDisplayed(emailErrorLocator);
    }

    public void clickOnEmailBox() {
        clickThis(SignUpEmailBoxLocator);
    }

    public void clickOnPasswordBox() {
        clickThis(signUpPasswprdLocator);
    }

    public boolean passwordErrorDisplayed() {
        return isWebElementDisplayed(passwordErrorLocator);

    }

    public boolean passwordEroordisplayed20() {
        return isWebElementDisplayed(passwordErrorGreater20Locator);
    }

    public void clickOnFirstNameBox() {
        clickThis(firstNameLocator);
    }

    public void enterInvalidName(String name) {
        type(firstNameLocator, name);
    }

    public void enterInvalidSecondName(String SecondName) {
        type(secondNameLocator, SecondName);
    }


    public void clickOnSecondNameBox() {
        clickThis(secondNameLocator);
    }

    public boolean firstNameErrorDisplayed() {
        return isWebElementDisplayed(firstNameErrorLocator);
    }

    public boolean secondNameErrordisplayed() {
        return isWebElementDisplayed(secondNameErrorLocator);
    }

    public boolean tickMarkisDisplayed() {
        return isWebElementDisplayed(tickMarkLocator);


    }

    public boolean passwordTickMarkisDisplayed() {
        return isWebElementDisplayed(passwordTickMarkLocator);
    }

    public void enterValidName(String name) {
        type(firstNameLocator, name);
    }

    public boolean firstNameTickMarkisDisplayed() {
        return isWebElementDisplayed(firstNameTickMark);


    }

    public void enterValidSecondName(String SecondName) {
        type(secondNameLocator, SecondName);
    }

    public boolean secondNameTickMarkisDisplayed() {
        return isWebElementDisplayed(secondNameTickMark);


    }

    public void clickHelpButton() {
        clickThis(helpButton);
    }

    public void clickwebSite() {
        clickThis(FeedbackButtonLocator);


    }


    public void submitButton() {
        String hhh = UseDriver.getDriver().getWindowHandle();
        Set<String> allHandles = getAllHandles();
        for (String handle : allHandles) {
            if (!handle.equals(hhh)) {
                UseDriver.getDriver().switchTo().window(handle);
            }
        }
        getElementWithScroll(submitButtonLocator).click();
        Misc.sleep(2);

    }


    public boolean messageEnterInformationIsdisplayed() {
        String textEnerInfo = getElement(messageEnterInformationLocator).getText();
        Check.checkEquals(textEnerInfo, "Please fill in the required information highlighted below.", "Error.text value is not equal");
        return isWebElementDisplayed(messageEnterInformationLocator);
    }

    public boolean redDotsBoxDisplayed() {
        return isWebElementDisplayed(redDotsLocator);


    }

    public void clickReatingThree() {
        String hhh = UseDriver.getDriver().getWindowHandle();
        Set<String> allHandles = getAllHandles();
        for (String handle : allHandles) {
            if (!handle.equals(hhh)) {
                UseDriver.getDriver().switchTo().window(handle);
            }
        }
        clickThis(reatingThreeLocator);
    }

    public void enterInformation() {
        type(textArea, "bla bla bla");
    }

    public void selectOptions() {
        clickThis(selectReturnOptionsLocator);
        clickThis(unsureOptionLocator);
        clickThis(textArea);
        scrollDown(1000);
    }

    public void bookedOnHotelsYes() {
        clickThis(boockedHotelBeforeNo);
    }

    public void accomplishYes() {
        clickThis(accomplishYesLocator);
    }

    public boolean verifyThankYouForfeedbackDisp() {
        clickThis(submitButtonLocator);
        String textEnerInfo = getElement(thankYouForFeedBackLocator).getText();
        Check.checkEquals(textEnerInfo, "THANK YOU FOR YOUR FEEDBACK.", "Error.text value is not equal");
        return isWebElementDisplayed(thankYouForFeedBackLocator);
    }
    ///////////////////////////////////////////////////////////

    public boolean freeCnacellationDisplayed() {
        scrollDown(500);
        String textEnerInfo = getElement(freecancellationLocator).getText();
        Check.checkEquals(textEnerInfo, "Free cancellation\n" +
                "on most hotels*", "Error.text value is not equal");
        return isWebElementDisplayed(freecancellationLocator);
    }

    public boolean priceGuaranteeDisplayed() {
        String textEnerInfo = getElement(ourPriceGuaranteeLocator).getText();
        Check.checkEquals(textEnerInfo, "Our price guarantee\n" +
                "find out more", "Error.text value is not equal");
        return isWebElementDisplayed(ourPriceGuaranteeLocator);
    }

    public boolean getRewardNightDisplayed() {
        String textEnerInfo = getElement(getRewardNightLocator).getText();
        Check.checkEquals(textEnerInfo, "Get a reward night\n" +
                "For every 10 nights you stay", "Error.text value is not equal");
        return isWebElementDisplayed(getRewardNightLocator);


    }

    public void clickGuaranteeLink() {
        clickThis(ourPriceGuaranteeLocator);
    }

    public void clickGoingBack() {
        clickThis(goingBackLocator);
        scrollDown(500);


    }

    public void clickGetRewardNight() {
        clickThis(getRewardNightLocator);
    }

    public boolean InstantSavingsDisplayed() {
        String textEnerInfo = getElement(instantsavingsLocator).getText();
        Check.checkEquals(textEnerInfo, "Instant savings. Reward* nights. And more ...", "Error.text value is not equal");
        return isWebElementDisplayed(instantsavingsLocator);


    }
}






    /**
     * Launch Hotels.com
     * Click on Checkin Calendar
     * Go to current month if not displayed
     * Verify For current month
     * 1) Past dates (if any) are disabled.
     * 2) Back button on current month is disabled
     */


