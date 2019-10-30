package tests;

import base.Hooks;
import common.BrowserActions;
import common.WaitActions;
import constants.errorMessages.NavigationMenuErrorMessages;
import constants.pages.NavigationMenuConstants;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.NavigationMenuFactory;

import static org.testng.Assert.*;

public class NavigationMenuTest extends Hooks {
    private NavigationMenuFactory navigationMenu;


    @BeforeClass
    public void setup(){
        navigationMenu = new NavigationMenuFactory(NavigationMenuConstants.URL);
        WaitActions.waitSpecificTime(10000);
    }

    @Test
    public void checkTheItemsNavigationMenuVisible() {
        SoftAssert softAssert = new SoftAssert();
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
        SoftAssert softAssert = new SoftAssert();
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
        }

        @Test
        public void checkRedirectionLogoClick() {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getLogo()), NavigationMenuConstants.LOGO_EXPECTED_URL, NavigationMenuErrorMessages.LOGO_CLICK_ERROR);
        }
////    @Test
////    public void checkRedirectionAfterClickingTheSearchField() {
////        SoftAssert softAssert = new SoftAssert();
////        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getSearchField()), NavigationMenuConstants.SEARCH_EXPECTED_URL, NavigationMenuErrorMessages.SEARCH_CLICK_ERROR);
////    }
////
////        .sendKeys();
//
//        navigationMenu.getSearch().submit()

    @Test
    public void checkRedirectionAfterClickingTheVideoButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getVideoButton()), NavigationMenuConstants.VIDEO_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.VIDEO_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheSettingsButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getSettingsButton()), NavigationMenuConstants.SETTINGS_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.SETTINGS_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheAppsButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getAppsButton()), NavigationMenuConstants.APPS_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.APPS_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheSignIn() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getSignIn()), NavigationMenuConstants.SIGNIN_EXPECTED_URL, NavigationMenuErrorMessages.SIGNIN_CLICK_ERROR);
    }

    private long clickOnTheElementAndGetUrl(WebElement logo) {
    }

    @Test
    public void checkRedirectionAfterClickingTheHamburgerItem() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getHamburgerItem()), NavigationMenuConstants.HAMBURGERITEM_EXPECTED_URL, NavigationMenuErrorMessages.HAMBURGERITEM_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheHomeButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getHomeButton()), NavigationMenuConstants.HOME_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.HOME_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheTrendingButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getTrendingButton()), NavigationMenuConstants.TRENDING_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.TRENDING_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheSubscriptionsButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getSubscriptionsButton()), NavigationMenuConstants.SUBSCRIPTIONS_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.SUBSCRIPTIONS_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheLibraryButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getLibraryButton()), NavigationMenuConstants.LIBRARY_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.LIBRARY_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheHistoryButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getHistoryButton()), NavigationMenuConstants.HISTORY_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.HISTORY_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheMusicButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getMusicButton()), NavigationMenuConstants.MUSIC_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.MUSIC_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheSportsButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getSportsButton()), NavigationMenuConstants.SPORTS_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.SPORTS_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheGamingButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getGamingButton()), NavigationMenuConstants.GAMING_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.GAMING_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheNewsButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getNewsButton()), NavigationMenuConstants.NEWS_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.NEWS_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheLiveBlackButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getLiveBlackButton()), NavigationMenuConstants.LIVE_BLACK_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.LIVE_BLACK_BUTTON_CLICK_ERROR);
    }
    @Test
    public void checkRedirectionAfterClickingTheFashionButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getFashionButton()), NavigationMenuConstants.FASHION_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.FASHION_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheVideo360Button() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getVideo360Button()), NavigationMenuConstants.VIDEO360_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.VIDEO360_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheBrowsChannels() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getBrowsChannels()), NavigationMenuConstants.BROWS_CHANNELS_EXPECTED_URL, NavigationMenuErrorMessages.BROWS_CHANNELS_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheLiveRedButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getLiveRedButton()), NavigationMenuConstants.LIVE_RED_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.LIVE_RED_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheSettingsLeftButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getSettingsLeftButton()), NavigationMenuConstants.SETTINGS_LEFT_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.SETTINGS_LEFT_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheReportHistoryButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getReportHistoryButton()), NavigationMenuConstants.REPORT_HISTORY_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.REPORT_HISTORY_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheHelpButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getHelpButton()), NavigationMenuConstants.HELP_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.HELP_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheSendFeedbackButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getSendFeedbackButton()), NavigationMenuConstants.SEND_FEEDBACK_BUTTON_EXPECTED_URL, NavigationMenuErrorMessages.SEND_FEEDBACK_BUTTON_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheAbout() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getAbout()), NavigationMenuConstants.ABOUT_EXPECTED_URL, NavigationMenuErrorMessages.ABOUT_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingThePress() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getPress()), NavigationMenuConstants.PRESS_EXPECTED_URL, NavigationMenuErrorMessages.PRESS_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheCopyright() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getCopyright()), NavigationMenuConstants.COPYRIGHT_EXPECTED_URL, NavigationMenuErrorMessages.COPYRIGHT_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheContactUs() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getContactUs()), NavigationMenuConstants.CONTACTUS_EXPECTED_URL, NavigationMenuErrorMessages.CONTACTUS_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheCreators() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getCreators()), NavigationMenuConstants.CREATORS_EXPECTED_URL, NavigationMenuErrorMessages.CREATORS_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheAdvertise() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getAdvertise()), NavigationMenuConstants.ADVERTISE_EXPECTED_URL, NavigationMenuErrorMessages.ADVERTISE_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheDevelopers() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getDevelopers()), NavigationMenuConstants.DEVELOPERS_EXPECTED_URL, NavigationMenuErrorMessages.DEVELOPERS_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheTerms() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getTerms()), NavigationMenuConstants.TERMS_EXPECTED_URL, NavigationMenuErrorMessages.TERMS_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingThePrivacy() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getPrivacy()), NavigationMenuConstants.PRIVACY_EXPECTED_URL, NavigationMenuErrorMessages.PRIVACY_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingThePolicy() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getPolicy()), NavigationMenuConstants.POLICY_EXPECTED_URL, NavigationMenuErrorMessages.POLICY_CLICK_ERROR);
    }

    @Test
    public void checkRedirectionAfterClickingTheTestNewFeatures() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(clickOnTheElementAndGetUrl(navigationMenu.getTestNewFeatures()), NavigationMenuConstants.TEST_NEW_FEATURES_EXPECTED_URL, NavigationMenuErrorMessages.TEST_NEW_FEATURES_CLICK_ERROR);
    }


}
