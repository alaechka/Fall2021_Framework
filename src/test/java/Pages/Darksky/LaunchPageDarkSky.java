package Pages.Darksky;

import Helper.Misc;
import Pages.WebCommands;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LaunchPageDarkSky extends WebCommands {
    By feelsLikeLocator=By.xpath("//span[@class='feels-like-text']");
    By lowtempLocator=By.xpath("//span[@class='low-temp-text']");
    By highTempLocator=By.xpath("//span[@class='high-temp-text']");

    public void verifyFeelsLike(){
      String feels= getTempValue(feelsLikeLocator);
      String low=getTempValue(lowtempLocator);
      String high=getTempValue(highTempLocator);
        int feelsLinkTemp = Misc.removeDegreeAndGetTempAsInt(feels);
        int lowTemp = Misc.removeDegreeAndGetTempAsInt(low);
        int highTemp = Misc.removeDegreeAndGetTempAsInt(high);
        Assert.assertTrue(highTemp>=feelsLinkTemp && feelsLinkTemp>=lowTemp, "feelsLike tempValue is NOT in between the lowTemp and highTemp value");


    }

}
