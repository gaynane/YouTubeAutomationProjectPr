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

        NavigationMenuFactory navigationMenu;
        SoftAssert.assertTrue(navigationMenu.getHamburgerItem().isDisplayed(),  "Hamburger menu is not display");
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

        Assert.assertTrue(navigationMenu.getHomeButton().isDisplayed(), "Home button is not display");
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
        Assert.assertTrue(navigationMenu.getSettingsLeftButton().isDisplayed(), "Settings left button is not display");
        Assert.assertTrue(navigationMenu.getReportHistoryButton().isDisplayed(), "Report history button is not display");
        Assert.assertTrue(navigationMenu.getHelpButton().isDisplayed(), "Help button is not display");
        Assert.assertTrue(navigationMenu.getSendFeedbackButton().isDisplayed(), "Send Feedback button is not display");
        Assert.assertTrue(navigationMenu.getAbout().isDisplayed(), "About item is not display");
        Assert.assertTrue(navigationMenu.getPress().isDisplayed(), "Press item is not display");
        Assert.assertTrue(navigationMenu.getCopyright().isDisplayed(), "Copyright item is not display");
        Assert.assertTrue(navigationMenu.getContactUs().isDisplayed(), "Contact us item is not display");
        Assert.assertTrue(navigationMenu.getCreators().isDisplayed(), "Creators item is not display");
        Assert.assertTrue(navigationMenu.getAdvertise().isDisplayed(), "Advertise item is not display");
        Assert.assertTrue(navigationMenu.getDevelopers().isDisplayed(), "Developers item is not display");
        Assert.assertTrue(navigationMenu.getTerms().isDisplayed(), "Text Terms item is not display");
        Assert.assertTrue(navigationMenu.getPrivacy().isDisplayed(), "Text Privacy item is not display");
        Assert.assertTrue(navigationMenu.getPolicy().isDisplayed(), "Text Policy & Safety item is not display");
        Assert.assertTrue(navigationMenu.getTestNewFeatures().isDisplayed(), "Test new features item is not display");

    }

    @Test
    public void checkNavigationBarItemsWhenClickingItems() {
        navigationMenu.getLogo().click();
        navigationMenu.getSearchField().sendKeys("Stepanavan");
        navigationMenu.getSearch().submit();
        navigationMenu.getVideoButton().click();
        navigationMenu.getSettingsButton().click();
        navigationMenu.getAppsButton().click();
        navigationMenu.getSignIn().click();

     }

     @Test
    public void checkPageLeftNavigationBarItemsWhenClickingItems(){
        navigationMenu.getHamburgerItem().click();

        navigationMenu.getHomeButton().click();
        navigationMenu.getTrendingButton().click();
        navigationMenu.getSubscriptionsButton().click();
        navigationMenu.getLibraryButton().click();
        navigationMenu.getHistoryButton().click();
        navigationMenu.getSignInButton().click();
        navigationMenu.getMusicButton().click();
        navigationMenu.getSportsButton().click();
        navigationMenu.getGamingButton().click();
        navigationMenu.getNewsButton().click();
        navigationMenu.getLiveBlackButton().click();
        navigationMenu.getFashionButton().click();
        navigationMenu.getVideo360Button().click();
        navigationMenu.getBrowsChannels().click();
        navigationMenu.getLiveRedButton().click();
        navigationMenu.getSettingsButton().click();
        navigationMenu.getReportHistoryButton().click();
        navigationMenu.getHelpButton().click();
        navigationMenu.getSendFeedbackButton().click();
        navigationMenu.getAbout().click();
        navigationMenu.getPress().click();
        navigationMenu.getCopyright().click();
        navigationMenu.getContactUs().click();
        navigationMenu.getCreators().click();
        navigationMenu.getAdvertise().click();
        navigationMenu.getDevelopers().click();
        navigationMenu.getTerms().click();
        navigationMenu.getPrivacy().click();
        navigationMenu.getPolicy().click();
        navigationMenu.getTestNewFeatures().click();

     }

}
