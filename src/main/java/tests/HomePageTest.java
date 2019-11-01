package tests;

import base.Hooks;
import constants.errorMessages.HomePageErrorMesage;
import constants.errorMessages.NavigationMenuErrorMessages;
import constants.pages.NavigationMenuConstants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePageFactory;

import static common.ClickActions.clickOnTheElementAndGetUrl;

public class HomePageTest extends Hooks {
    HomePageFactory homePage;

    @BeforeClass
    public void setup(){
        homePage = new HomePageFactory(NavigationMenuConstants.URL);
    }

    @Test
    public void checkTheItemsHomePageVisible(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.getHorizontalList().isDisplayed(), HomePageErrorMesage.HORIZONTAL_LIST_ERROR_MESSAGE);
        softAssert.assertTrue(homePage.getThumbnail().isDisplayed(),HomePageErrorMesage.TUMBNAIL_ERROR_MESSAGE);
        softAssert.assertTrue(homePage.getOverlays().isDisplayed(),HomePageErrorMesage.OVERLAYS_ERROR_MESSAG);
        softAssert.assertTrue(homePage.getDetalis().isDisplayed(),HomePageErrorMesage.DETALIS_ERROR_MESSAGE);
        softAssert.assertAll();
    }

}
