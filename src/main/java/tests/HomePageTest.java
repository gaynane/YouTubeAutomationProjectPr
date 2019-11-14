package tests;

import base.Hooks;
import common.ClickActions;
import common.Video;
import constants.errorMessages.HomePageErrorMessage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePageFactory;
import java.util.List;
import static base.BasePage.getDriver;
import static common.ClickActions.clickOnTheElementAndGetUrl;

public class HomePageTest extends Hooks {
    HomePageFactory homePage;


    @Test
    public void checkTheItemsHomePageVisible(){
        List<Video> videos = homePage.getVideos();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(videos.get(0).getImage().isDisplayed(),HomePageErrorMessage.IMAGE_ERROR_MESSAGE);
        softAssert.assertTrue(videos.get(0).getVideoTitle().isDisplayed(),HomePageErrorMessage.VIDEO_TITLE_ERROR_MESSAGE);
        softAssert.assertTrue(videos.get(0).getChannelName().isDisplayed(),HomePageErrorMessage.CHANNEL_NAME_ERROR_MESSAGE);
        softAssert.assertTrue(videos.get(0).getViews().isDisplayed(), HomePageErrorMessage.VIEWS_ERROR_MESSAGE);
        softAssert.assertTrue(videos.get( 0 ).getTime().isDisplayed(),HomePageErrorMessage.TIME_ERROR_MESSAGE);
        softAssert.assertAll();
    }
//    @Test
//    public void checkRedirectionAfterClickingTheReportThumbnail() {
//        Assert.assertEquals(ClickActions.clickOnTheElementAndGetUrl(videos.getImage(),getDriver()), "noooooooo");
//    }
}
