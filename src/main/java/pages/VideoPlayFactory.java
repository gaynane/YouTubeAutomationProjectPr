package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoPlayFactory extends BasePageFactory {
    @FindBy(css="")
    WebElement videoPlaying;

    @FindBy(css="")
    WebElement timeLine;

    @FindBy(css="")
    WebElement playButton;

    @FindBy(css="")
    WebElement playNextButton;

    @FindBy(css="")
    WebElement durationVideo;

    @FindBy(css="")
    WebElement settingsButton;

    @FindBy(css="")
    WebElement miniplayerButton;

    @FindBy(css="")
    WebElement theaterModeButton;

    @FindBy(css="")
    WebElement fullScreenButton;

    @FindBy(css="")
    WebElement videoPausing;

    @FindBy(css="")
    WebElement muteButton;

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
