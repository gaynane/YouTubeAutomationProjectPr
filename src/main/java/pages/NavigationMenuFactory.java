package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationMenuFactory extends BasePageFactory{
    @FindBy(css="#guide-icon")
    WebElement hamburgerItem;

    @FindBy(css="#logo-icon-container")
    WebElement logo;

    @FindBy(css="#search")
    WebElement searchField;

    @FindBy(css="#search-icon-legacy > yt-icon > svg")
    WebElement search;

    @FindBy(css="#button > yt-icon")
    WebElement videoButton;

    @FindBy(css="")
    WebElement appsButton;

    @FindBy(css="")
    WebElement settingsButton;

    @FindBy(css="input[value=signIn]")
    WebElement signIn;

    @FindBy(css="")
    WebElement homeButton;

    @FindBy(css="")
    WebElement trendingButton;

    @FindBy(css="")
    WebElement subscriptionsButton;

    @FindBy(css="")
    WebElement libraryButton;

    @FindBy(css="")
    WebElement historyButton;

    @FindBy(css="")
    WebElement signInLikeVideosText;

    @FindBy(css="")
    WebElement signInButton;

    @FindBy(css="")
    WebElement gamingButton;

    @FindBy(css="")
    WebElement musicButton;

    @FindBy(css="")
    WebElement sportsButton;

    @FindBy(css="")
    WebElement newsButton;

    @FindBy(css="")
    WebElement bestOfYouTubeText;

    @FindBy(css="")
    WebElement liveBlackButton;

    @FindBy(css="")
    WebElement fashionButton;

    @FindBy(css="")
    WebElement video360Button;

    @FindBy(css="")
    WebElement browsChannels;

    @FindBy(css="")
    WebElement moreFromYouTubeText;

    @FindBy(css="")
    WebElement liveRedButton;

    @FindBy(css="")
    WebElement settingsLeftButton;

    @FindBy(css="")
    WebElement reportHistoryButton;

    @FindBy(css="")
    WebElement helpButton;

    @FindBy(css="")
    WebElement sendFeedbackButton;

    @FindBy(css="")
    WebElement aboutPressCopyright;

    @FindBy(css="")
    WebElement contactUsCreators;

    @FindBy(css="")
    WebElement advertiseDevelopers;

    @FindBy(css="")
    WebElement termsPrivacyPolicy;

    @FindBy(css="")
    WebElement testNewFeatures;

    @FindBy(css="")
    WebElement YouTubeLLCText;


    public NavigationMenuFactory(){
        super();
    }
    public NavigationMenuFactory(String url){
        super(url);
     }
    public WebElement getHamburgerItem(){
        return hamburgerItem;
    }
    public WebElement getLogo(){
        return logo;
    }
    public WebElement getSearchField(){
        return searchField;
    }
    public WebElement getSearch() {
        return search;
    }
    public WebElement getVideoButton(){
        return videoButton;
    }
    public WebElement getAppsButton(){
        return appsButton;
    }
    public WebElement getSettingsButton(){
        return settingsButton;
    }
    public WebElement getSignIn(){
        return signIn;
    }
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
    public WebElement getAboutPressCopyright() {return aboutPressCopyright;}
    public WebElement getContactUsCreators() {return contactUsCreators;}
    public WebElement getAdvertiseDevelopers() {return advertiseDevelopers;}
    public WebElement getTermsPrivacyPolicy() {return termsPrivacyPolicy;}
    public WebElement getTestNewFeatures() {return testNewFeatures;}
    public WebElement getYouTubeLLCText() {return bestOfYouTubeText;}

}
