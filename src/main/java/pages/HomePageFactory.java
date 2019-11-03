package pages;

import constants.pages.HomePageConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory extends BasePageFactory {
    public HomePageFactory(){
      super();
    }
    public HomePageFactory(String url){
        super(url);
    }

//    @FindBy(css = HomePageConstants.VIDEO_AREA_LOCATOR)
//    private WebElement videoArea;
//
//    @FindBy(css = HomePageConstants.THUMBNAIL_LOCATOR)
//    private WebElement thumbnail;
//
//    @FindBy(css = HomePageConstants.VIDEO_TITLE_LOCATOR)
//   private WebElement videoTitle;
//
//    @FindBy(css = HomePageConstants.DETALIS_LOCATOR)
//    private WebElement detalis;
//
//    @FindBy(css= HomePageConstants.CHANNEL_NAME_LOCATOR)
//    private WebElement channelName;
//
//    @FindBy(css= HomePageConstants.VIEWS_LOCATOR)
//    private WebElement views;
//
//    @FindBy(css= HomePageConstants.TIME_LOCATOR)
//    private WebElement time;
//
//    public WebElement getVideoArea() { return videoArea ;}
//    public WebElement getThumbnail() { return thumbnail;}
//    public WebElement getVideoTitle() { return videoTitle;}
//    public WebElement getDetalis() { return detalis; }
//    public WebElement getViews() { return views;}
//    public WebElement getChannelName() { return channelName;}
//    public WebElement getTime() { return time;}

}
