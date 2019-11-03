package tests;

import common.ClickActions;
import common.Video;
import constants.errorMessages.VideoErrorMessage;
import constants.pages.NavigationMenuConstants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static base.BasePage.getDriver;

public class VideoTest  {
    Video video;

    @BeforeClass
    public void setup(){
        video = new Video();
    }

    @Test
    public void videoAreaVisible(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(video.getVideoArea().isDisplayed(), VideoErrorMessage.VIDEO_AREA_ERROR_MESSAGE);
        softAssert.assertTrue(video.getThumbnail().isDisplayed(),VideoErrorMessage.TUMBNAIL_ERROR_MESSAGE);
        softAssert.assertTrue(video.getVideoTitle().isDisplayed(),VideoErrorMessage.VIDEO_TITLE_ERROR_MESSAGE);
        softAssert.assertTrue(video.getDetalis().isDisplayed(),VideoErrorMessage.DETALIS_ERROR_MESSAGE);
        softAssert.assertTrue(video.getChannelName().isDisplayed(),VideoErrorMessage.CHANNEL_NAME_ERROR_MESSAGE);
        softAssert.assertTrue(video.getViews().isDisplayed(),VideoErrorMessage.VIEWS_ERROR_MESSAGE);
        softAssert.assertTrue(video.getTime().isDisplayed(),VideoErrorMessage.TIME_ERROR_MESSAGE);
        softAssert.assertAll();
    }
    @Test
    public void checkRedirectionAfterClickingTheReportThumbnail() {
        Assert.assertEquals(ClickActions.clickOnTheElementAndGetUrl(video.getThumbnail(),getDriver()), "noooooooo");
    }
}
