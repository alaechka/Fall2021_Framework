package StepDefinition;

import Helper.Check;
import Helper.DateUtil;
import HomeWork4.task1.SignUpPage;
import Pages.Facebook.LaunchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;

public class LoginSD {

    LaunchPage launchPage = new LaunchPage();
    SignUpPage sPage=new SignUpPage();

//    @When("^I enter '(.+)' as login email$")
//    public void enterEmail(String inputEmail) {
//        launchPage.enterLoginEmail(inputEmail);
//    }
//
//    @When("^I enter '(.+)' as login password$")
//    public void enterPassword(String inputPwd) {
//        launchPage.enterLoginPassword(inputPwd);
//    }

    @When("^I enter '(.+)' as login (email|password|phone)$")
    public void enterLoginData(String data, String field) {
        switch (field) {
            case "email":
                launchPage.enterLoginEmail(data);
                break;
            case "password":
                launchPage.enterLoginPassword(data);
                break;
            case "phone":
                // code to enter phone
                break;
        }
    }

    @When("^I login in app$")
    public void login() {
        launchPage.enterLoginEmail("validEmail");
        launchPage.enterLoginPassword("validPassword");
        launchPage.clickLoginButton();
    }

    @When("^I click on login button$")
    public void clickLogin() {
        launchPage.clickLoginButton();
    }


    @And("^I verify login error is displayed$")
    public void verifyInvalidLoginError() {
        Check.checkTrue(launchPage.isInvalidLoginErrorDisplayed(), "Invalid Login error is NOT displayed");
    }
    @When("^I click Messenger link$")
    public void clickMessenger(){
        launchPage.clickMessengerLink();}
    @When ("^I click log in button$")
    public void clickMessengerLoginButton(){
        launchPage.clickMessengerLoginButton();
    }

    @When("^I verify link \"Find your account and log in\" is displayed$")
    public void  verify(){
        Check.checkTrue(launchPage.isFindYourAccountAndLoginDisplaed(),"Link is not displayed");
    }
    @When("^I verify \"continue\" button is displayed$")
    public void verifyContinueDisplayed(){
        Check.checkTrue(launchPage.isContinueDisplayed(),"Continue button is not displayed");
    }
    @When("^I verify \"continue\" button is enabled$")
    public void continueButtonEnabled(){
        Check.checkTrue(launchPage.isContinueEnabled(),"Continue button is not  enabled");

    }
    @Then("^I verify \"Keep me signed in\" checkbox is NOT selected$")
    public void chechBoxIsNotSelected(){
        Check.checkFalse(launchPage.isKeepSignedInBox(), "Keep me Sign in checkBox is selected");
    }

    @When("^I click on Create New Account$")
    public void createNewAccount(){
        launchPage.isCreateNewAccountClick();
    }
    @When("^I enter first name$")
    public void enterName(){
        launchPage.enterName();
    }
    @When("^I enter last name$")
    public void enterSecondName(){
        launchPage.enterSecondName();
    }

    @When("^I enter mobile number$")
    public void enterPhoneNum(){
        launchPage.enterPhoneNum();
    }
    @When("^I enter new password$")
    public void enterPassword(){
        launchPage.enterPassword();
    }
    @When("^I enter date of birth$")
    public void enterDateOfBirth(){
        launchPage.selectDay();
        launchPage.selectMonth();
        launchPage.selectYear();

    }
    @When("^I click on Sign Up$")
    public void clickOnSignUp(){
        launchPage.clickSubmit();
    }
    @Then("^I verify Please select gender error is displayed$")
    public void selectGenderErrorDisplayed(){
        Check.checkTrue(launchPage.isErrorDisplayed(),"error msg is not displayed");
    }
    @Then("^I get Date information and compare it$")
    public void conpareDateFB(){
        Check.checkTrue(launchPage.compareDAY(),"Days dont match");
    }

    @When("^clickit$")
    public void clickit(){
        launchPage.clickDayDropdown();
    }
    @When("^selectDay$")
    public void select(){
        launchPage.selectDay();

    }

    @When("^I check date is selected in dropdown is current date$")
    public void checkDate(){
        Check.checkEquals(sPage.getSelectedMonth(), DateUtil.getDateInFormat("MMM"), "Month in dropdown is not as expected");
        Check.checkEquals(sPage.getSelectedDay(), DateUtil.getDateInFormat("d"),"Day in dropdown is not as expected");
        Check.checkEquals(sPage.getSeletedYear(), DateUtil.getDateInFormat("YYYY"),"Year in dropdown is not as expected");
    }

//    @When("^I verify user lands on home page$")
//    public void verifyUserLoggedIn() {
//        // code to add later
//    }

   // @Then("^I verify login error '(.+)' is displayed$")
    public void verifyLoginError(String errorMsg) {
        switch (errorMsg) {
            case "incorrect email or password":
                // verify incorrect email or password msg is displayed
                break;
            case "enter credentials again":
                // verify enter credentials again msg is displayed
                break;
            default:
                System.out.println("Not implemented for " + errorMsg + " msg");
        }


        }

        //Check.checkEquals(.getSelectedDay(), DateUtil.getDateInFormat("d"),"Day in dropdown is not as expected");

    }


    /**
     Scenario: Verify user gets error for invalid credential
     Given I launch facebook website
     When I enter '%^&&*()' as login email
     When I enter 'abcd@1234' as login password
     When I click on login button
     Then I verify login error 'incorrect email or password' is displayed
     And I verify login error 'Enter credentials again' is displayed
     */



