package constants.pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.NavigationMenuFactory;

public class NavigationMenuConstants {

    @FindBy(css="#guide-icon")
    private WebElement hamburgerItem;

    @FindBy(css="#logo-icon-container")
    private WebElement logo;

    @FindBy(css="#search-input")
    private WebElement searchField;

    @FindBy(css="#search-icon-legacy > yt-icon > svg")
    private WebElement search;

    @FindBy(css="[aria-label=Create a video or post]")
    private WebElement videoButton;

    @FindBy(css="[aria-label=YouTube apps")
    private WebElement appsButton;

    @FindBy(css="[aria-label=Settings]")
    private WebElement settingsButton;

    @FindBy(css="[aria-label=Sign in]")
    private WebElement signIn;

    @FindBy(css="a[title='Home']")
    private WebElement homeButton;

    @FindBy(css="a[title='Trending']")
    private WebElement trendingButton;

    @FindBy(css="a[title='Subscriptions']")
    private WebElement subscriptionsButton;

    @FindBy(css="a[title='Library']")
    private WebElement libraryButton;

    @FindBy(css="a[title='Trending']")
    private WebElement historyButton;

    @FindBy(css="a[title='History']")
    private WebElement signInLikeVideosText;

    @FindBy(css="yt-formatted-string:contains('Sign in to like videos, comment, and subscribe.')")
    private WebElement signInButton;

    @FindBy(css="a[title='Gaming']")
    private  WebElement gamingButton;

    @FindBy(css="a[title='Music']")
    private  WebElement musicButton;

    @FindBy(css="a[title='Sports']")
    private WebElement sportsButton;

    @FindBy(css="a[title='News']")
    private  WebElement newsButton;

    @FindBy(css="")
    private  WebElement bestOfYouTubeText;

    @FindBy(css="a[title='Live']")
    private  WebElement liveBlackButton;

    @FindBy(css="a[title='Fashion']")
    private  WebElement fashionButton;

    @FindBy(css="a[title='360° Video']")
    private WebElement video360Button;

    @FindBy(css="a[title='Browse channels']")
    private WebElement browsChannels;

    @FindBy(css="yt-formatted-string:contains('More from TouTube')")
    private WebElement moreFromYouTubeText;


    @FindBy(css="")
    WebElement liveRedButton;

    @FindBy(css="a[title='Settings']")
    private WebElement settingsLeftButton;

    @FindBy(css="a[title='Report history']")
    WebElement reportHistoryButton;

    @FindBy(css="a[title='Help']")
    WebElement helpButton;

    @FindBy(css="a[title='Send feedback']")
    WebElement sendFeedbackButton;

    @FindBy(css="a.contains('About')")
    WebElement about;

    @FindBy(css="a.contains('Press')")
    WebElement press;

    @FindBy(css="a.contains('Copyright')")
    WebElement copyright;

    @FindBy(css="a.contains('Contact us')")
    WebElement contactUs;

    @FindBy(css="a.contains('Creators')")
    WebElement creators;

    @FindBy(css="a.contains('Advertise')")
    WebElement advertise;

    @FindBy(css="a.contains('Developers')")
    WebElement developers;

    @FindBy(css="a.contains('Terms')")
    WebElement terms;

    @FindBy(css="a.contains('Privacy')")
    WebElement privacy;

    @FindBy(css="a.contains('Policy & Safety')")
    WebElement policy;

    @FindBy(css="a.contains('Test new features')")
    WebElement testNewFeatures;



}
