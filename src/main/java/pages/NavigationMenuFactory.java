package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationMenuFactory extends BasePageFactory{
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


    public NavigationMenuFactory(){
        super();
    }
    public NavigationMenuFactory(String url){
        super(url);
     }

    public WebElement getHamburgerItem() {return hamburgerItem;}
    public WebElement getLogo() {return logo;}
    public WebElement getSearchField() {return searchField;}
    public WebElement getSearch() {return search;}
    public WebElement getVideoButton() {return videoButton;}
    public WebElement getAppsButton() {return appsButton;}
    public WebElement getSettingsButton() {return settingsButton;}
    public WebElement getSignIn() {return signIn;}
    public WebElement getHomeButton() {return homeButton;}
    public WebElement getTrendingButton() {return trendingButton;}
    public WebElement getSubscriptionsButton() {return subscriptionsButton;}
    public WebElement getLibraryButton() {return  libraryButton;}
    public WebElement getHistoryButton() {return historyButton;}
    public WebElement getSignInLikeVideosText() {return signInLikeVideosText;}
    public WebElement getSignInButton() {return signInButton;}
    public WebElement getBestOfYouTubeText() {return  bestOfYouTubeText;}
    public WebElement getMusicButton() {return  musicButton;}
    public WebElement getSportsButton() {return sportsButton;}
    public WebElement getGamingButton() {return gamingButton;}
    public WebElement getNewsButton() {return newsButton;}
    public WebElement getLiveBlackButton() {return liveBlackButton;}
    public WebElement getFashionButton() {return fashionButton;}
    public WebElement getVideo360Button() {return video360Button;}
    public WebElement getBrowsChannels() {return browsChannels;}
    public WebElement getMoreFromYouTubeText() {return moreFromYouTubeText;}
    public WebElement getSettingsLeftButton() {return settingsLeftButton;}
    public WebElement getReportHistoryButton() {return reportHistoryButton;}
    public WebElement getHelpButton() {return helpButton;}
    public WebElement getSendFeedbackButton() {return sendFeedbackButton;}
    public WebElement getAbout() {return about;}
    public WebElement getPress() {return press;}
    public WebElement getCopyright() {return copyright;}
    public WebElement getContactUs() {return contactUs;}
    public WebElement getCreators() {return creators;}
    public WebElement getAdvertise() {return advertise;}
    public WebElement getDevelopers() {return developers;}
    public WebElement getTerms() {return terms;}
    public WebElement getPrivacy() {return privacy;}
    public WebElement getPolicy() {return policy;}
    public WebElement getTestNewFeatures() {return testNewFeatures;}
    public WebElement getYouTubeLLCText() {return bestOfYouTubeText;}

}
