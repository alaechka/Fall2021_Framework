package HomeWork4.task1;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class SignUpPage extends WebCommands {


        By firstNameLocator = By.xpath("//input[@name=\"firstname\"]");
        By lastNameLocator = By.xpath("//input[@name=\"lastname\"]");
        By phoneEmailLocator =By.xpath("//input[@name=\"reg_email__\"]");
        By pwdLocator = By.xpath("//input[@name=\"reg_passwd__\"]");
        By monthLocator = By.xpath("//select[@id=\"month\"]");
        By dayLocator = By.xpath("//select[@id=\"day\"]");
        By yearLocator = By.xpath("//select[@id=\"year\"]");
        By signUpButtonLocator = By.xpath("//button[@name = 'websubmit']");
        By genderErrorMessageLocator = By.xpath("(//div[contains(text(), \"You can\")])");
        By selectedMonthLocator = By.xpath("//select[@id='month']//option[@selected='1']");
        By selectedDayLocator = By.xpath("//select[@id='day']//option[@selected='1']");
        By selectedYearLocator = By.xpath("//select[@id='year']//option[@selected='1']");

        public String getSelectedMonth() {
            return getElement(selectedMonthLocator).getText();
        }
        public String getSelectedDay(){
            return getElement(selectedDayLocator).getText();
        }
        public String getSeletedYear(){
            return getElement(selectedYearLocator).getText();
        }
        public void enterFirstName(String firstName){
            type(firstNameLocator,firstName);
        }
        public void enterLastName(String lastName){
            type(lastNameLocator,lastName);
        }
        public void enterPhoneEmail(String phoneEmail){
            type(phoneEmailLocator,phoneEmail);
        }
        public void enterPassword(String password){
            type(pwdLocator,password);
        }
        public void clickMonthDropdown(){
            clickThis(monthLocator);
        }
        public void selectMonth(String month){
            selectFromDropdown(monthLocator, month);
        }
        public void clickDayDropdown(){
            clickThis(dayLocator);
        }
        public void selectDay(String day){
            selectFromDropdown(dayLocator, day);
        }
        public void clickYearDropDown(){
            clickThis(yearLocator);
        }
        public void selectYear(String year){
            selectFromDropdown(yearLocator, year);
        }
        public void clickSignUpButton(){
            clickThis(signUpButtonLocator);
        }
        public String getGenderErrorMessage(){
            return getElement(genderErrorMessageLocator).getText();
        }
    }

