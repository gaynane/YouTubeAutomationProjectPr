package pages;

import constants.pages.VideoPlayConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoPlayFactory extends HomePageFactory {
    @FindBy(css= VideoPlayConstants.VIDEO_PLAYING_LOCATOR)
    private WebElement videoPlaying;

    @FindBy(css= VideoPlayConstants.TIME_LINE_LOCATOR)
    private WebElement timeLine;

    @FindBy(css= VideoPlayConstants.PLAY_BUTTON_LOCATOR)
    private WebElement playButton;

    @FindBy(css= VideoPlayConstants.PLAY_NEXT_BUTTON_LOCATOR)
    private WebElement playNextButton;

    @FindBy(css= VideoPlayConstants.DURATION_VIDEO_LOCATOR)
    private WebElement durationVideo;

    @FindBy(css= VideoPlayConstants.SETTINGS_BUTTON_LOCATOR)
   private WebElement settingsButton;

    @FindBy(css= VideoPlayConstants.MINI_PLAYER_BUTTON_LOCATOR)
    private WebElement miniplayerButton;

    @FindBy(css= VideoPlayConstants.THEATER_MODE_BUTTON_LOCATOR)
    private WebElement theaterModeButton;

    @FindBy(css= VideoPlayConstants.FULL_SCREEN_BUTTON_LOCATOR)
    private WebElement fullScreenButton;

    @FindBy(css= VideoPlayConstants.VIDEO_PAUSING_LOCATOR)
    private WebElement videoPausing;

    @FindBy(css= VideoPlayConstants.MUTE_BUTTON_LOCATOR)
    private WebElement muteButton;

    public VideoPlayFactory(){
        super();
    }
    public VideoPlayFactory(String url){
        super(url);
    }

    public WebElement getVideoPlaying() {return videoPlaying;}
    public WebElement getTimeLine() {return timeLine;}
    public WebElement getPlayButton() {return playButton;}
    public WebElement getPlayNextButton() {return playNextButton;}
    public WebElement getDurationVideo() {return durationVideo;}
    public WebElement getSettingsButton() {return settingsButton;}
    public WebElement getMiniplayerButton() { return miniplayerButton;}
    public WebElement getMuteButton() { return muteButton; }
    public WebElement getTheaterModeButton() { return theaterModeButton; }
    public WebElement getFullScreenButton() {return fullScreenButton;}
    public WebElement getVideoPausing() { return videoPausing; }

}
