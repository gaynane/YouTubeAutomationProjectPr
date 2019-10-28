 package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationMenuFactory extends BasePageFactory{

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
