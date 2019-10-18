package tests;

import base.Hooks;
import common.WaitActions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NavigationMenuFactory;


public class NavigationMenuTest extends Hooks {

    private NavigationMenuFactory navigationMenu;


    @BeforeClass
    public void setup(){
        navigationMenu = new NavigationMenuFactory("http://www.youtube.com");
        WaitActions.waitSpecificTime(10000);

    }

    @Test
    public void checkTheItemsNavigationMenuVisible() {

        Assert.assertTrue(navigationMenu.getHamburgerItem().isDisplayed(),  "Hamburger menu is not display");
        Assert.assertTrue(navigationMenu.getLogo().isDisplayed(), "Logo button is not display");
        Assert.assertTrue(navigationMenu.getSearchField().isSelected(), "Search field is not display");
        Assert.assertTrue(navigationMenu.getSearch().isDisplayed(), "Search button is not display");
        Assert.assertTrue(navigationMenu.getVideoButton().isDisplayed(), "Video button is not display");
        Assert.assertTrue(navigationMenu.getAppsButton().isDisplayed(), "Apps button is not display");
        Assert.assertTrue(navigationMenu.getSettingsButton().isDisplayed(), "Settings button is not display");
        Assert.assertTrue(navigationMenu.getSignIn().isDisplayed(), "SignIn button is not display");
    }

    @Test
    public void checkLeftNavigationBarItemsWhenClickingHamburgerItem(){
        navigationMenu.getHamburgerItem().click();
        try {
            navigationMenu.getHomeButton().wait(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Assert.assertTrue(navigationMenu.getHomeButton().isDisplayed(), "Home button is not display");
        Assert.assertTrue(navigationMenu.getTrendingButton().isDisplayed(), "Trending button is not display");
        Assert.assertTrue(navigationMenu.getSubscriptionsButton().isDisplayed(), "Subscriptions button is not display");
        Assert.assertTrue(navigationMenu.getLibraryButton().isDisplayed(), "Library button is not display");
        Assert.assertTrue(navigationMenu.getHistoryButton().isDisplayed(), "History button is not display");
        Assert.assertTrue(navigationMenu.getSignInLikeVideosText().isDisplayed(), "Text SignIn Like Videos is not display");
        Assert.assertTrue(navigationMenu.getSignInButton().isDisplayed(), "SignIn button is not display");
        Assert.assertTrue(navigationMenu.getBestOfYouTubeText().isDisplayed(), "Text Best of Youtube is no- display");
        Assert.assertTrue(navigationMenu.getMusicButton().isDisplayed(), "Music button is not display");
        Assert.assertTrue(navigationMenu.getSportsButton().isDisplayed(), "Sports button is not display");
        Assert.assertTrue(navigationMenu.getGamingButton().isDisplayed(), "Gaming button is not display");
        Assert.assertTrue(navigationMenu.getNewsButton().isDisplayed(), "News button is not display");
        Assert.assertTrue(navigationMenu.getLiveBlackButton().isDisplayed(), "Live black button is not display");
        Assert.assertTrue(navigationMenu.getFashionButton().isDisplayed(), "Fashion button is not display");
        Assert.assertTrue(navigationMenu.getVideo360Button().isDisplayed(), "360 Video button is not display");
        Assert.assertTrue(navigationMenu.getBrowsChannels().isDisplayed(), "Brows channels button is not display");
        Assert.assertTrue(navigationMenu.getMoreFromYouTubeText().isDisplayed(), "SignIn button is not display");
        Assert.assertTrue(navigationMenu.getLiveRedButton().isDisplayed(), "Live red button is not display");
        Assert.assertTrue(navigationMenu.getSettingsLeftButton().isDisplayed(), "Settings left button is not display");
        Assert.assertTrue(navigationMenu.getReportHistoryButton().isDisplayed(), "Report history button is not display");
        Assert.assertTrue(navigationMenu.getHelpButton().isDisplayed(), "Help button is not display");
        Assert.assertTrue(navigationMenu.getSendFeedbackButton().isDisplayed(), "Send Feedback button is not display");
        Assert.assertTrue(navigationMenu.getAboutPressCopyright().isDisplayed(), "About press copyright button is not display");
        Assert.assertTrue(navigationMenu.getContactUsCreators().isDisplayed(), "contact us cteators item is not display");
        Assert.assertTrue(navigationMenu.getAdvertiseDevelopers().isDisplayed(), "AdvertiseDevelopers item is not display");
        Assert.assertTrue(navigationMenu.getTermsPrivacyPolicy().isDisplayed(), "Text Terms Privacy Policy item is not display");
        Assert.assertTrue(navigationMenu.getTestNewFeatures().isDisplayed(), "Test new features item is not display");
        Assert.assertTrue(navigationMenu.getYouTubeLLCText().isDisplayed(), "2019 YouTube LLC is not display");
        WaitActions.waitSpecificTime(30000);

    }
}
