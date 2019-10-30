package tests;

import base.Hooks;
import constants.errorMessages.HomePageErrorMesage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePageFactory;

public class HomePageTest extends Hooks {
    HomePageFactory homePage;
    SoftAssert softAssert;
    @BeforeClass
    public void setup(){
        homePage = new HomePageFactory("http://www.youtube.com");
    }

    @Test
    public void checkTheItemsHomePageVisible(){
        softAssert.assertTrue(homePage.getHorizontalList().isDisplayed(), HomePageErrorMesage.HORIZONTAL_LIST_ERROR_MESSAGE);
        softAssert.assertTrue(homePage.getThumbnail().isDisplayed(),HomePageErrorMesage.TUMBNAIL_ERROR_MESSAGE);
        softAssert.assertTrue(homePage.getOverlays().isDisplayed(),HomePageErrorMesage.OVERLAYS_ERROR_MESSAG);
        softAssert.assertTrue(homePage.getDetalis().isDisplayed(),HomePageErrorMesage.DETALIS_ERROR_MESSAGE);
    }
}
