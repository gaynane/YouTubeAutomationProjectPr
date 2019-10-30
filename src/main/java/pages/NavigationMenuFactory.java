 package pages;

import constants.pages.NavigationMenuConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationMenuFactory extends BasePageFactory{

    public NavigationMenuFactory(){
        super();
    }
    public NavigationMenuFactory(String url){
        super(url);
     }

    @FindBy(css= NavigationMenuConstants.HAMBURGERITEM_LOCATOR)
     WebElement hamburgerItem;

    @FindBy(css = NavigationMenuConstants.LOGO_LOCATOR)
    WebElement logo;

    @FindBy(css = NavigationMenuConstants.SEARCHFIELD_LOCATOR)
    WebElement searchField;

    @FindBy(css= NavigationMenuConstants.SEARCH_LOCATOR)
    WebElement search;

    @FindBy(css= NavigationMenuConstants.VIDEOBUTTON_LOCATOR)
    private WebElement videoButton;

    @FindBy(css= NavigationMenuConstants.APPS_BUTTON_LOCATOR)
    private WebElement appsButton;

    @FindBy(css= NavigationMenuConstants.SETTINGS_BUTTON_LOCATOR)
    private WebElement settingsButton;

    @FindBy(css= NavigationMenuConstants.SIGNIN_LOCATOR)
    private WebElement signIn;

    @FindBy(css= NavigationMenuConstants.HOME_BUTTON_LOCATOR)
    private WebElement homeButton;

    @FindBy(css=NavigationMenuConstants.TRENDING_BUTTON_LOCATOR)
    private WebElement trendingButton;

    @FindBy(css= NavigationMenuConstants.SUBSCRIPTIONS_BUTTON_LOCATOR)
    private WebElement subscriptionsButton;

    @FindBy(css= NavigationMenuConstants.LIBRARY_BUTTON_LOCATOR)
    private WebElement libraryButton;

    @FindBy(css= NavigationMenuConstants.HISTORY_BUTTON_LOCATOR)
    private WebElement historyButton;

    @FindBy(css= NavigationMenuConstants.SIGNIN_LIKE_VIDEOS_TEXT_LOCATOR)
    private WebElement signInLikeVideosText;

    @FindBy(css= NavigationMenuConstants.SIGNIN_BUTTON_LOCATOR)
    private WebElement signInButton;

    @FindBy(css = NavigationMenuConstants.GAMING_BUTTON_LOCATOR)
    private  WebElement gamingButton;

    @FindBy(css= NavigationMenuConstants.MUSIC_BUTTON_LOCATOR)
    private  WebElement musicButton;

    @FindBy(css= NavigationMenuConstants.SPORTS_BUTTON_LOCATOR)
    private WebElement sportsButton;

    @FindBy(css= NavigationMenuConstants.NEWS_BUTTON_LOCATOR)
    private  WebElement newsButton;

    @FindBy(css= NavigationMenuConstants.BEST_OF_YOUTUBE_LOCATOR)
    private  WebElement bestOfYouTubeText;

    @FindBy(css= NavigationMenuConstants.LIVE_BLACK_BUTTON_LOCATOR)
    private  WebElement liveBlackButton;

    @FindBy(css= NavigationMenuConstants.FASHION_BUTTON_LOCATOR)
    private  WebElement fashionButton;

    @FindBy(css= NavigationMenuConstants.VIDEO360_BUTTON_LOCATOR)
    private WebElement video360Button;

    @FindBy(css= NavigationMenuConstants.BROWS_CHANNELS_LOCATOR)
    private WebElement browsChannels;

    @FindBy(css= NavigationMenuConstants.MORE_FROM_YOUTUBE_LOCATOR)
    private WebElement moreFromYouTubeText;

    @FindBy(css= NavigationMenuConstants.LIVE_RED_BUTTON_LOCATOR)
    WebElement liveRedButton;

    @FindBy(css= NavigationMenuConstants.SETTINGS_LEFT_BUTTON_LOCATOR)
    private WebElement settingsLeftButton;

    @FindBy(css= NavigationMenuConstants.REPORT_HISTORY_BUTTON_LOCATOR)
    WebElement reportHistoryButton;

    @FindBy(css= NavigationMenuConstants.HELP_BUTTON_LOCATOR)
    WebElement helpButton;

    @FindBy(css= NavigationMenuConstants.SEND_FEEDBACK_BUTTON_LOCATOR)
    WebElement sendFeedbackButton;

    @FindBy(css= NavigationMenuConstants.ABOUT_LOCATOR)
    WebElement about;

    @FindBy(css= NavigationMenuConstants.PRESS_LOCATOR)
    WebElement press;

    @FindBy(css= NavigationMenuConstants.COPYRIGHT_LOCATOR)
    WebElement copyright;

    @FindBy(css= NavigationMenuConstants.CONTACT_US_LOCATOR)
    WebElement contactUs;

    @FindBy(css= NavigationMenuConstants.CREATORS_LOCATOR)
    WebElement creators;

    @FindBy(css= NavigationMenuConstants.ADVERTISE_LOCATOR)
    WebElement advertise;

    @FindBy(css= NavigationMenuConstants.DEVELOPERS_LOCATOR)
    WebElement developers;

    @FindBy(css= NavigationMenuConstants.TERMS_LOCATOR)
    WebElement terms;

    @FindBy(css= NavigationMenuConstants.PRIVACY_LOCATOR)
    WebElement privacy;

    @FindBy(css= NavigationMenuConstants.POLICY_LOCATOR)
    WebElement policy;

    @FindBy(css= NavigationMenuConstants.TEST_NEW_FEATURES_LOCATOR)
    WebElement testNewFeatures;

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

    public WebElement getLiveRedButton() {return liveRedButton;}

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
