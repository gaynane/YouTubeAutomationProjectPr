package tests;

import base.Hooks;
import common.WaitActions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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

        Assert.assertTrue(videoPlay.getPlayButton().isDisplayed(), "The Play button is not display");
        Assert.assertTrue(videoPlay.getPlayNextButton().isDisplayed(), "The Play Next button is not display");
        Assert.assertTrue(videoPlay.getMuteButton().isDisplayed(), "The Mute button is not display");
        Assert.assertTrue(videoPlay.getDurationVideo().isDisplayed(), "The duration video is not display");
        Assert.assertTrue(videoPlay.getTimeLine().isDisplayed(), "The TimeLine is not display");
        Assert.assertTrue(videoPlay.getSettingsButton().isDisplayed(), "The Settings button is not display");
        Assert.assertTrue(videoPlay.getMiniplayerButton().isDisplayed(), "The Miniplayer button is not display");
        Assert.assertTrue(videoPlay.getTheaterModeButton().isDisplayed(), "The Theater mode button is not display");
        Assert.assertTrue(videoPlay.getFullScreenButton().isDisplayed(), "The Full screen button is not display");
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
