package common;

import base.BasePage;
import constants.pages.HomePageConstants;
import constants.pages.VideoConstants;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Video{

    public Video(){
    }

    @FindBy(css = VideoConstants.VIDEO_AREA_LOCATOR)
    private WebElement videoArea;

    @FindBy(css = VideoConstants.THUMBNAIL_LOCATOR)
    private WebElement thumbnail;

    @FindBy(css = VideoConstants.VIDEO_TITLE_LOCATOR)
    private WebElement videoTitle;

    @FindBy(css = VideoConstants.DETALIS_LOCATOR)
    private WebElement detalis;

    @FindBy(css= VideoConstants.CHANNEL_NAME_LOCATOR)
    private WebElement channelName;

    @FindBy(css= VideoConstants.VIEWS_LOCATOR)
    private WebElement views;

    @FindBy(css= VideoConstants.TIME_LOCATOR)
    private WebElement time;

    public WebElement getVideoArea() { return videoArea ;}
    public WebElement getThumbnail() { return thumbnail;}
    public WebElement getVideoTitle() { return videoTitle;}
    public WebElement getDetalis() { return detalis; }
    public WebElement getViews() { return views;}
    public WebElement getChannelName() { return channelName;}
    public WebElement getTime() { return time;}

}

