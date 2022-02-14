package Pages.Facebook;

import Helper.DateUtil;
import HomeWork4.task1.SignUpPage;
import Pages.WebCommands;
import Web.UseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LaunchPage extends WebCommands

{

    SignUpPage sPage=new SignUpPage();
    // Locators of elements on Launch Page
    By loginEmailLocator = By.id("email");
    By loginPasswordLocator = By.id("pass");
    By loginButtonLocator = By.xpath("//button[@name='login']");
    By messengerLocator = By.linkText("Messenger");
    By messengerButtonlocator = By.id("loginbutton");

    By allLinksLocator = By.tagName("a");
    By facebookPayLocator = By.linkText("Facebook Pay");

    By invalidLoginErrorLocator = By.xpath("//div[text()='The email or mobile number you entered isn’t connected to an account. ']");
    By findYourAccountAndLoginLocator = By.linkText("Find your account and log in.");
    By continueButton = By.id("loginbutton");
    By keepMeSignedInBox = By.xpath("//input[@name='persistent']/following-sibling::span");
    By createAnewAccount = By.xpath("//a[text()='Create new account' or text()='Create New Account']");
    By FirstNameLocator = By.name("firstname");
    By SecondNameLocator = By.name("lastname");
    By phoneNumLocator = By.name("reg_email__");
    By passwordLocator = By.name("reg_passwd__");
    By monthLocator = By.id("month");
    By dayLocator = By.id("day");
    By yearLocator = By.id("year");
    By submitLocator = By.name("websubmit");
    By selectGenderLocator = By.xpath("//div[text()='Please choose a gender. You can change who can see this later.']");
    // Methods to interact with elements of Launch Page
    By textArea= By.tagName("textarea");

    // type in login emailBox
    public void enterLoginEmail(String loginEmail) {
        type(loginEmailLocator, loginEmail);
    }

    // if login emailBox is enabled
    public boolean isLoginEmailBoxEnabled() {
        return getElement(loginEmailLocator).isEnabled();
    }

    // type in login passwordBox
    public void enterLoginPassword(String loginPwd) {
        type(loginPasswordLocator, loginPwd);
    }
    // if login passwordBox is enabled

    // click login button
    public void clickLoginButton() {
        clickThis(loginButtonLocator);
    }

    // if login button is enabled

    // to click the Messenger link
    public void clickMessengerLink() {
        clickThis(messengerLocator);
    }

    public void clickMessengerLoginButton() {
        JavascriptExecutor js = (JavascriptExecutor) UseDriver.getDriver();     // Casting
        js.executeScript("scrollBy(0,800);");
        clickThis(messengerButtonlocator);
    }

    // to get number of links
    public int getNumberOfLinks() {
        List<WebElement> allLinks = getElements(allLinksLocator);
        return allLinks.size();
    }

    public void clickFacebookPay() {
        clickThis(facebookPayLocator);
    }

    public boolean isInvalidLoginErrorDisplayed() {
        return isWebElementDisplayed(invalidLoginErrorLocator);

    }

    public boolean isFindYourAccountAndLoginDisplaed() {
        return isWebElementDisplayed(findYourAccountAndLoginLocator);
    }

    public boolean isContinueDisplayed() {
        return isWebElementDisplayed(continueButton);
    }

    public boolean isContinueEnabled() {
        return isWebElementEnabled(continueButton);
    }

    public boolean isKeepSignedInBox() {
        return isWebElementSelected(keepMeSignedInBox);
    }

    public void isCreateNewAccountClick() {
        clickThis(createAnewAccount);
    }

    public void enterName() {
        enterInformation(FirstNameLocator, "John");
    }

    public void enterSecondName() {
        enterInformation(SecondNameLocator, "Oliver");
    }

    public void enterPhoneNum() {
        enterInformation(phoneNumLocator, "9846353738");
    }

    public void enterPassword() {
        enterInformation(passwordLocator, "myPassw0rd");
    }

    public void selectMonth() {
        selectFromDropdown(monthLocator, "Jan");
    }

    public void selectYear() {
        selectFromDropdown(yearLocator, "2000");
    }

    public void selectDay() {
        selectFromDropdown(dayLocator, "1");
    }

    public void clickSubmit() {
        clickThis(submitLocator);
    }

    public boolean isErrorDisplayed() {
        return isWebElementDisplayed(selectGenderLocator);
    }

    public boolean getInformationDay() {

        String storeDateDay = getInformation(dayLocator, " ");
        String storeDateMonth = getInformation(monthLocator, " ");
        String storeDateYear = getInformation(yearLocator, " ");

        Date dateNow = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd");
        String day = formatDate.toString();
        SimpleDateFormat formatDayM = new SimpleDateFormat("MMM");
        String month = formatDayM.toString();
        SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
        String year = formatYear.toString();

        boolean check = compare(storeDateDay, day);
        boolean check2 = compare(storeDateMonth, month);
        boolean check3 = compare(storeDateYear, year);
        return check;


    }

    public boolean compareDAY() {
        String storeDateDay = getInformation(dayLocator, "");
        Date dateNow = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd");
        String day = formatDate.toString();
        boolean check = compare(storeDateDay, day);
        return check;
    }

    public void clickDayDropdown(){
        clickThis(dayLocator);
    }
    public void selectDay(String day){
        selectFromDropdown(dayLocator, day);

    }



}






