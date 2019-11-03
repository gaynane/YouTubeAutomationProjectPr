package tests;

import base.Hooks;
import common.ClickActions;

import constants.errorMessages.NavigationMenuErrorMessages;
import constants.pages.NavigationMenuConstants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePageFactory;

import static base.BasePage.getDriver;
import static common.ClickActions.clickOnTheElementAndGetUrl;

public class HomePageTest extends Hooks {
    HomePageFactory homePage;

//    @BeforeClass
//    public void setup(){
//        homePage = new HomePageFactory(NavigationMenuConstants.URL);
//    }
//
//    @Test
//    public void checkTheItemsHomePageVisible(){
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(homePage.getVideoArea().isDisplayed(),HomePageErrorMesage.VIDEO_AREA_ERROR_MESSAGE);
//        softAssert.assertTrue(homePage.getThumbnail().isDisplayed(),HomePageErrorMesage.TUMBNAIL_ERROR_MESSAGE);
//        softAssert.assertTrue(homePage.getVideoTitle().isDisplayed(),HomePageErrorMesage.VIDEO_TITLE_ERROR_MESSAGE);
//        softAssert.assertTrue(homePage.getDetalis().isDisplayed(),HomePageErrorMesage.DETALIS_ERROR_MESSAGE);
//        softAssert.assertTrue(homePage.getChannelName().isDisplayed(),HomePageErrorMesage.CHANNEL_NAME_ERROR_MESSAGE);
//        softAssert.assertTrue(homePage.getViews().isDisplayed(),HomePageErrorMesage.VIEWS_ERROR_MESSAGE);
//        softAssert.assertTrue(homePage.getTime().isDisplayed(),HomePageErrorMesage.TIME_ERROR_MESSAGE);
//        softAssert.assertAll();
//    }
//    @Test
//    public void checkRedirectionAfterClickingTheReportThumbnail() {
//        Assert.assertEquals(ClickActions.clickOnTheElementAndGetUrl(homePage.getThumbnail(),getDriver()), "noooooooo");
//    }
}
