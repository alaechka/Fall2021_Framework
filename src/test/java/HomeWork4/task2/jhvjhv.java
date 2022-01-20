package HomeWork4.task2;

import Helper.Check;
import Helper.DateUtil;
import HomeWork4.task1.SignUpPage;
import Pages.Facebook.LaunchPage;
import Web.UseDriver;
import org.testng.annotations.Test;

import java.util.Date;

public class jhvjhv {
    LaunchPage launch=new LaunchPage();
    SignUpPage sPage=new SignUpPage();
    Date f =new Date();

    @Test
    public void verifyBirthDayDropdownDefaults(){
        UseDriver.openUrl("https://www.facebook.com/");
        launch.isCreateNewAccountClick();
        Check.checkEquals(sPage.getSelectedMonth(), DateUtil.getDateInFormat("MMM"), "Month in dropdown is not as expected");
        Check.checkEquals(sPage.getSelectedDay(), DateUtil.getDateInFormat("d"),"Day in dropdown is not as expected");
        Check.checkEquals(sPage.getSeletedYear(), DateUtil.getDateInFormat("YYYY"),"Year in dropdown is not as expected");
    }
}
