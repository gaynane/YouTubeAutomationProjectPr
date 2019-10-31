package tests;

import base.Hooks;
import common.WaitActions;
import constants.errorMessages.VideoPlayErrorMessage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePageFactory;
import pages.VideoPlayFactory;

public class VideoPlayTest  {
    private VideoPlayFactory videoPlay;

    @BeforeClass
    public void setup() {
        videoPlay = new VideoPlayFactory();
        WaitActions.waitSpecificTime(5000);
    }

    @Test
    public void checkVideoPlayerItemsVisible() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(videoPlay.getPlayButton().isDisplayed(), VideoPlayErrorMessage.PLAY_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(videoPlay.getPlayNextButton().isDisplayed(), VideoPlayErrorMessage.PLAY_NEXT_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(videoPlay.getMuteButton().isDisplayed(), VideoPlayErrorMessage.MUTE_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(videoPlay.getDurationVideo().isDisplayed(), VideoPlayErrorMessage.DURATION_VIDEO_ERROR_MESSAGE);
        softAssert.assertTrue(videoPlay.getTimeLine().isDisplayed(), VideoPlayErrorMessage.TIME_LINE_ERROR_MESSAGE);
        softAssert.assertTrue(videoPlay.getSettingsButton().isDisplayed(), VideoPlayErrorMessage.VIDEO_SETTINGS_ERROR_MESSAGE);
        softAssert.assertTrue(videoPlay.getMiniplayerButton().isDisplayed(), VideoPlayErrorMessage.MINIPLAYER_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(videoPlay.getTheaterModeButton().isDisplayed(), VideoPlayErrorMessage.THEATER_MODE_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(videoPlay.getFullScreenButton().isDisplayed(), VideoPlayErrorMessage.FULL_SCREEN_BUTTON_ERROR_MESSAGE);
        softAssert.assertAll();
    }

    @Test
    public void checkVideoPlayerItemsWhenClicking(){

        videoPlay.getPlayButton().click();
        videoPlay.getPlayNextButton().click();
        videoPlay.getMuteButton().click();
        videoPlay.getTimeLine().click();
        videoPlay.getSettingsButton().click();
        videoPlay.getMiniplayerButton().click();
        videoPlay.getTheaterModeButton().click();
        videoPlay.getFullScreenButton().click();

    }
}
