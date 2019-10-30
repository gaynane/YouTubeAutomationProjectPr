package tests;

import base.Hooks;
import common.WaitActions;
import constants.errorMessages.NavigationMenuErrorMessages;
import constants.pages.NavigationMenuConstants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.NavigationMenuFactory;

import static org.testng.Assert.*;

public class NavigationMenuTest extends Hooks {
    private NavigationMenuFactory navigationMenu;
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void setup(){
        navigationMenu = new NavigationMenuFactory(NavigationMenuConstants.URL);
        WaitActions.waitSpecificTime(10000);
    }

    @Test
    public void checkTheItemsNavigationMenuVisible() {

        softAssert.assertTrue(navigationMenu.getHamburgerItem().isDisplayed(), NavigationMenuErrorMessages.HAMBURGER_ITEM_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getLogo().isDisplayed(), NavigationMenuErrorMessages.LOGO_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSearchField().isSelected(), NavigationMenuErrorMessages.SEARCH_FIELD_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSearch().isDisplayed(), NavigationMenuErrorMessages.SEARCH_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getVideoButton().isDisplayed(), NavigationMenuErrorMessages.VIDEO_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getAppsButton().isDisplayed(), NavigationMenuErrorMessages.APPS_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSettingsButton().isDisplayed(), NavigationMenuErrorMessages.SETTINGS_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSignIn().isDisplayed(), NavigationMenuErrorMessages.SIGN_IN_ERROR_MESSAGE);
        softAssert.assertAll();
    }

    @Test
    public void checkLeftNavigationBarItemsWhenClickingHamburgerItem(){
        navigationMenu.getHamburgerItem().click();

        softAssert.assertTrue(navigationMenu.getHomeButton().isDisplayed(), NavigationMenuErrorMessages.HOME_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getTrendingButton().isDisplayed(), NavigationMenuErrorMessages.TRENDING_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSubscriptionsButton().isDisplayed(), NavigationMenuErrorMessages.SUBSCRIPTIONS_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getLibraryButton().isDisplayed(), NavigationMenuErrorMessages.LIBRARY_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getHistoryButton().isDisplayed(), NavigationMenuErrorMessages.HISTORY_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSignInLikeVideosText().isDisplayed(), NavigationMenuErrorMessages.SIGNIN_LIKE_VIDEOS_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSignInButton().isDisplayed(), NavigationMenuErrorMessages.SIGNIN_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getBestOfYouTubeText().isDisplayed(), NavigationMenuErrorMessages.BEST_OF_YOUTUBE_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getMusicButton().isDisplayed(), NavigationMenuErrorMessages.MUSIC_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSportsButton().isDisplayed(),NavigationMenuErrorMessages.SPORTS_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getGamingButton().isDisplayed(), NavigationMenuErrorMessages.GAMING_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getNewsButton().isDisplayed(), NavigationMenuErrorMessages.NEWS_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getLiveBlackButton().isDisplayed(), NavigationMenuErrorMessages.LIVE_BLACK_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getFashionButton().isDisplayed(), NavigationMenuErrorMessages.FASHION_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getVideo360Button().isDisplayed(), NavigationMenuErrorMessages.VIDEO360_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getBrowsChannels().isDisplayed(), NavigationMenuErrorMessages.BROWS_CHANNELS_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getMoreFromYouTubeText().isDisplayed(), NavigationMenuErrorMessages.MORE_FROM_YOUTUBE_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSettingsLeftButton().isDisplayed(), NavigationMenuErrorMessages.SETTINGS_LEFT_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getReportHistoryButton().isDisplayed(), NavigationMenuErrorMessages.REPORT_HISTORY_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getHelpButton().isDisplayed(), NavigationMenuErrorMessages.HELP_BUTTON_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getSendFeedbackButton().isDisplayed(), NavigationMenuErrorMessages.SEND_FEEDBACK_BUTTON__ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getAbout().isDisplayed(), NavigationMenuErrorMessages.ABOUT_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getPress().isDisplayed(), NavigationMenuErrorMessages.PRESS__ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getCopyright().isDisplayed(), NavigationMenuErrorMessages.COPYRIGHT__ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getContactUs().isDisplayed(), NavigationMenuErrorMessages.CONTACTUS_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getCreators().isDisplayed(), NavigationMenuErrorMessages.CREATORS_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getAdvertise().isDisplayed(), NavigationMenuErrorMessages.ADVERTISE_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getDevelopers().isDisplayed(), NavigationMenuErrorMessages.DEVELOPERS_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getTerms().isDisplayed(), NavigationMenuErrorMessages.TERMS_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getPrivacy().isDisplayed(), NavigationMenuErrorMessages.PRIVACY_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getPolicy().isDisplayed(), NavigationMenuErrorMessages.POLICY_ERROR_MESSAGE);
        softAssert.assertTrue(navigationMenu.getTestNewFeatures().isDisplayed(), NavigationMenuErrorMessages.TEST_NEW_FEATURES_ERROR_MESSAGE);
        softAssert.assertAll();
    }

    @Test
    public void checkNavigationBarItemsWhenClickingItems() {
        navigationMenu.getLogo().click();

        navigationMenu.getSearchField().sendKeys();
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
